import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

public class EmailTest {

    /**
     * 要添加两个 jar 包 javamail
     * <dependency>
     *     <groupId>com.sun.mail</groupId>
     *     <artifactId>javax.mail</artifactId>
     *     <version>1.6.2</version>
     * </dependency>
     * <dependency>
     *     <groupId>javax.mail</groupId>
     *     <artifactId>mail</artifactId>
     *     <version>1.4.7</version>
     * </dependency>
     * */

    // SMTP 服务
    private static final String SMTP_SERVER = "smtp.qq.com";
    // 端口号
    private static final String SMTP_PORT = "465";
    // 发送者
    private static final String SENDER = "1605513752@qq.com";
    // 授权码, 去 QQ 邮箱的设置 账号中获取
    private static final String PWD = "112312334hhskhfs";
    // 接收者
    private static final String RECIPIENT = "2755886188@qq.com";

    public static MimeMessage createEmail(Session session) throws UnsupportedEncodingException, MessagingException {
        // 创建邮件对象
        MimeMessage msg = new MimeMessage(session);
        // 发送者
        InternetAddress address = new InternetAddress(SENDER, "0", "utf-8");
        // 添加到邮件中
        msg.setFrom(address);
        // 接收者
        InternetAddress internetAddress = new InternetAddress(RECIPIENT, "0", "utf-8");
        // 设置接收者的邮箱
        msg.setRecipient(Message.RecipientType.TO, internetAddress);
        // 标题
        msg.setSubject("测试", "utf-8");
        // 内容
        msg.setText("今天多少号来着，不知道多少号，还干什么呢？", "utf-8");
        // 发送的时间
        msg.setSentDate(new Date());
        // 保存
        msg.saveChanges();
        return msg;
    }

    public static void sendMail() throws UnsupportedEncodingException, MessagingException {
        // 创建邮件的配置
        Properties prop = new Properties();
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.host", SMTP_SERVER);
        prop.setProperty("mail.smtp.port", SMTP_PORT);
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.setProperty("mail.smtp.auth", "true");
        prop.setProperty("mail.smtp.ssl.enable", "true");

        // 根据邮件配置创建会话
        Session session = Session.getDefaultInstance(prop);
        // 开启 debug 模式可以看到日志信息
        session.setDebug(true);
        // 创建邮件
        MimeMessage email = createEmail(session);

        // 获取传输通道
        Transport transport = session.getTransport();
        // 进行连接
        transport.connect(SMTP_SERVER, SENDER, PWD);
        // 发送邮件
        transport.sendMessage(email, email.getAllRecipients());
        // 关闭通道
        transport.close();

    }

    public static void main(String[] args) throws UnsupportedEncodingException, MessagingException {
        sendMail();
    }

}
