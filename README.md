# Java-Basic-Title
java常遇到的一些基础理念和问题
     
## 一、JAVA基础

### 1、JDK 和 JRE 有什么区别？
- JDK是开发工具包，JRE是运行环境；JDK包含了JRE。  

### 2、== 和 equals 的区别是什么？
	 
	1、 " == " 是一个关键字，用来判断两边的变量是不是同一个；
	2、对于基本类型，如：int、float、double等，会判断它们的是不是相等的；
	3、对于引用类型，如：String、Object等、会在内存堆中判断它们是不是同一片数据。
	
	4、equals是一个方法，它继承了Object类，主要判断两个对象是不是"相等"的。

### 3、两个对象的 hashCode() 相同，则 equals() 也一定为 true， 对吗？
- 不一定， 因为hashCode()返回的是哈希码值，它是唯一的。如果有时发音相同的哈希码值也会一样：如通话、重地

### 4、final在java中有什么作用？
- 1、final在类上：final类表示这个类不能被继承
- 2、final在方法上： 表示这个方法不能被重载
- 3、final在成员变量上： 表示这个变量的值是不能被改变，如果改变了，编译或检查时，就会报错。
- 优点：①、final关键字提高了性能，JVM 和 JAVA 应用都会缓存final变量。
- ②、final变量可以安全的在多线程环境下进行共享，二不需要额外的同步开销。
- ③、使用final关键字， JVM会对方法、变量及类进行优化。
- 比如： String、StringBuilder、Double等
  
	 英语：final  -- fai柳

### 5、java 中的 Math.round(-1.5)等于多少？
- 等于 -1， 如果是满5，则进1； Math.round(-1.6) = -2;
	
	 Math.round(-1.5)  == -1;
	 Math.round(-1.6)  == -2;
	 Math.floor(1.5)   == 1;
	 Math.floor(1.6)   == 1;
	 Math.floor(-1.5)  == -2;
	 Math.floor(-1.6)  == -2;
	 Math.ceil(1.4)	   == 2;
	 Math.ceil(1.6)	   == 2;
	   Math.ceil(-1.4)   == -1;
	 Math.ceil(-1.7)   == -1;


### 6、String 属于基础的数据类型吗？
- 不属于，String 是引用类型
- 基本类型： byte、short、int、long、float、double、boolean、char
- 引用类型： String、Object

### 7、java 中操作字符都有哪些类， 它们之间有什么区别？

- String、StringBuilder、 StringBuffer
- Stirng是不可变的对象，每一次在改变String的时候，都是在生成一个新的String对象，会损耗性能。
- StringBuffer 是线程安全的，因为使用了Synchronized保证安全，但慢； 
- StringBuilder 没有做线程安全处理，但是它最快；能用StringBuilder的地方，不要去使用StringBuffer;

	 	英语：synchronized -- 性库奶斯特

### 8、String i = "i" 与 String str = new String("i") 一样吗？
- 如果使用 == 比较就不一样；
- 如果使用equals方法比较就一样。

### 9、如何将字符串反转？
	 创建StringBuilder对象或是StringBuffer对象，把字符串放进对象的构造函数中，在调用reverse()（反转的方法）返回一个String

	 英语： reverse 	-- 饿挖斯	

### 10、String 类的常用方法都有哪些？

	 subString()		-- 截取字符
 	 split() 		-- 分割字符
 	 hashCode() 		-- 获取哈希码值
 	 equals() 		-- 值对比
 	 charAt() 		-- 获取字符
 	 indexOf() 		-- 获取字符串，包含初始值，不包含结束值，从左到右
 	 lastIndexOf()  	-- 从右到左
 	 reverse() 		-- 反转
 	 relpace() 		-- 替换
 	 concat() 		-- 连接

	 英语：relpace		-- 问特斯
	       split		-- 斯普里
### 11、抽象类必须要有抽象方法吗？
- 不对，抽象类不一定要有抽象的方法；但有抽象方法的类一定是抽象类。

### 12、普通类和抽象类有哪些区别？
	
	 抽象类上必须加一个abstract关键字。
	 抽象不能有private修饰符
	 抽象类不能创建对象来使用
	 如果一个了继承了抽象类，则子类必选实现了父类抽象的方法；如果没有实现父类的抽象方法，则子类必须加上abstract

	 英语： abstract -- 鸭步斯爪
		private	 -- 派  特

### 13、抽象类能使用 final 修饰吗？
	 
	不能，因为抽象类是不能别实例化的，如果使用了 final 它是最终的不能被继承的，会报错。

### 14、接口和抽象类有什么区别？
- 抽象类的方法可以有默认的实现。
- 接口完全是抽象的，它的方法根本不存在任何的实现。
    
- 抽象实现使用的关键字是extends
- 接口使用的实现是implement
    
- 抽象类可以构造器
- 接口不能有构造器
  
- 抽象方法可以使用public、protected、default修饰符
- 接口方法默认的是public

- 如果你在抽象类中添加新的方法，可以给默认的实现，不要修改任何的代码
- 如果你在接口中添加新的方法，你必须要去改变实现类中的代码。

	英语： 	extends  -- 伊克斯殿s
		implement -- 因普门t
		protected -- 普塔贴

### 15、java 中 IO 流分为几种？
- 输入流：InputStream/Reader
- 输出流: OutputStream/Writer
- 字节流
- 字符流

	英语：  Stream -- 斯俊
		Reader -- V的
		Writer -- 赖的

### 16、BIO、NIO、AIO 有什么区别？  

- IO的方式通常分为几种：同步阻塞（BIO）、同步非阻塞（NIO）、异步非阻塞（AIO）

### 17、File的常：用方法都有哪些？

	 getName()  		- 文件名
	 getPath()  		- 路径
	 exists()	 	- 判断该文件是否存在
	 canWrite() 		- 判断文件是否可写
	 canRead()  		- 判断文件是否可读
	 ifFile()	   	- 是否有此文件
	 createTempFile() 	- 创建一个文件
	 listFiles()	   	- 当前文件夹中所以的文件，返回File[]
	 isFile()		- 是不是一个文件
	 isDirectory()		- 是不是一个文件夹

## 二、容器

### 18、java 容器都有哪些？
	
	 List、Set、Map

### 19、Collection 和 Collections 有什么区别？
	
	 1、Collection 是一个集合接口。它提供了对集合对象进行基本操作的通用接口方法。
	 2、Collections 是一个包装类。它包含有各种，有关集合操作的静态多态方法，不能被实例化，就像一个工具类，服务于Collection框架。

	 英语：Conllection -- 库撸沈

### 20、List、Set、Map 之间的区别是什么？
	
	 1、List：元素有序放入、可重复；
	 2、Set：元素无序放入，不可重复；
	 3、Map：元素按键值对存储，无序放入。

### 21、HashMap 和 Hashtable 的区别？
	
	 1、HasHMap 是非线程安全、非同步、可以有null键值；
	 2、Hashtabel 是线程安全的，多个连接共享一个资源，也是同步的，不能有null键值方式存储。

### 22、如何决定使用 HashMap 还是 TreeMap？

	 1、HashMap：适用于在Map中插入、删除和定位元素。
	 2、TreeMap：适用于按自然顺序或自定义顺序遍历键（key）。

	 英语： TreeMap	 -- 催马

### 23、说一下 HashMap 的实现原理？
	
	 HashMap 是基于哈希表的 Map 接口的非同步实现。HashMap现实提供所有可选的映射操作，并允许使用null键和null值，但它不保证映射的顺序，特别是不能保证该顺序是恒久不变的。
	
### 24、 说一下 HashSet 的是实现原理？

	 HashSet是基于HashMap实现的，HashSet底层使用HsahMap来保存所有的元素，确切的说HashSet的元素只存储于HashMap的key键上，而valve则使用于本来类的 static final的Object标识，HashSet相关操作，基本上都是直接调用HashMap的。

### 25、ArrayList 和 LinkedList 的区别是什么？
	 
	 ArrayList：内部使用数组的实现了存储，实现了ReandomAccess接口；
	 LinkedList：内部使用双向链表的结构实现存储，LinkedList有一个内部类作为存储的单元，里面有三个属性，第一个和最后一个是存储引用，另外LinkedList内部还有一个heaher属性，用来标识初始位置， 而第一个单元和最后一个单元都会指向header，因此形成了一个双向链接表。

	 英语：	LinkedList  -- 卫K拉门
	 	ReandomAccess	-- V恩点 撒斯

### 26、如何实现数组和 List 之间的转换？
	
	 1、数组转换 List ： 调用Stream.of(数组).collect(Collectors.toList)
	 2、List 转换 数组： list.toArray()方法就可以直接转换了；

	 英语：Stream  -- 斯俊
		collect -- 克烈T

### 27、ArrayList 和 Vector 的区别是什么？
	
	 1、ArrayList：不是线程安全，没有提供设置增长空间的方法；
	 2、Voector：是线程安全，可以同步，但访问的数据比ArrayList慢，它可以设置增长的空间方法。

	 英语： Voector  -- 哇得


### 28、Array 和 ArrayList 有何区别？
	
	 1、Array：是一个数组，最高效，但容量固定且无法改变。
	 2、ArrayList：是一个数组集合，容量可以动态的增长，但牺牲了效率。

### 29、在 Queue 中 poll() 和 remove() 有什么区别？

	 poll() 和 remove() 方法都是从队列中删除第一个元素；
	 1、remove()：在执行时，如果队列集合中没有数据，则会抛出空指针异常；
	 2、poll()：在执行时，如果队列集合中没有数据，则不会抛出异常，它会返回null值；
	 
	 英语：	Queue  -- 悉藕
	 	poll   -- 噢
	 
### 30、哪些集合类是线程安全的？
	 
	 1、Hashtable、Voector、Stack(继承了Voector类)

	 英语：	Voector  -- 哇得
		Stack 	 -- 斯答

### 39、迭代器 Iterator 是什么？
	 
	 迭代器是一种设计模式，它是一个对象，它可以遍历并选择序列中的对象，而开发人员不需要了解该序列的底层结构。迭代器通常被称为"轻量级"的对象，因为创建它代价小。
	 
	 英语：Iterator  -- 滴累得





### 40、Iterator 怎么使用，有什么特点？
	 
	 //列子1：
	 	List<String> list = new ArrayList<>();
	 	Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	 //例子2：
		Map<String, String> map = new HashMap<>();
		Iterator<Map<String, String>> i = map.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry<String, String> next = i.next();
			System.out.println(next.getKey + ":" + next.getValue());
		}

	  特点：1、Iterator 遍历集合元素的过程中不允许线程对集合元素进行修改，否则会报异常
		2、Iterator 遍历时，可以通过remove() 方法移除元素。
	 
 	  
	  英语： entry  	-- 恩决
		 Iterator  	-- 滴累得

### 41、Iterator 和 ListIterator 有什么区别？
	
	  1、ListIterator 可以向 List 中添加对象，而 Iterator 不能
	  2、ListIterator 可以实现从前到后的遍历，还有可以从后到前的遍历；而 Iterator 只能是从前到后的遍历；
	  3、ListIterator 可以定位当前索引的下标；而 Iterator 不能；
	  
### 42、怎么确保一个集合不能被修改？

	  在初始化的时候，可以加上static fianl进行修饰。

## 三、多线程

### 什么是多线程？
	
	 一个进程中可以并发多个线程，每条线程并行执行不同的任务。

	 多线程是多任务的一种特别的形式，但多线程使用了更小的资源开销。

### 43、并行和并发有什么区别？

	  并发：是在同一个CPU上，"同时"(指不是真正的同一时间，而是看是同时，但CPU会来回的切换多个程序)运行多个程序。
	  并行：是每个CPU运行一个程序，是真正的同时，但之间互不干扰。


### 44、线程和和进程的区别？

	  进程：进程包含了线程，每一个进程至少有一个线程，它们共享进程的地址空间，线程没有独立地址空间，但线程有自己的堆栈、局部变量。
	  进程：进程是资源分配基本单位，同一个进程内的线程可以共享进程资源。
	  线程：线程是CPU调度的基本单位，但进程不是。

### 45、守护线程是什么？
	
	 守护线程： 用来服务于用户线程的；用户线程就是：自己平常创建的普通线程。

### 46、创建线程有那几种方式？

	 1、继承Thread类创建线程类
	 2、实现Runable接口创建线程类

	 英语：	Thread  -- 夫略T
	 	Runable -- 韵呢步

### 47、说一下 runnable 和 callable 有什么区别？

	1、Runnable是从java1.1就有了，而Callable是1.5之后才加上去的；
	2、Callable规定的方法call(),Runnable规定的方式run();
	3、call()方法可以抛异常，但run()方法不行。

	英语：	runnable -- 韵呢步
		callable -- 看呢步
		run	 -- 

### 48、线程有哪些状态？
	
	创建、就绪、运行、阻塞、终止

### 49、sleep() 和 wait() 有什么区别？
	
	 1、sleep方法睡眠时，保持对象锁，仍然占有该锁；
	 2、waitf方法睡眠时，会释放对象锁。
	 
	英语：	slepp		-- 斯立P
		wait		-- 喂涂

### 50、notify() 和 notifyAll() 有什么区别？
	
	notify：唤醒正在等待此对象监视器的单个线程。
	notifyAll：唤醒正在等待此对象监视器的所有线程。
	
	英语： notify	 -- not的fai

### 51、线程的 run() 和 start() 有什么区别？
	
	start：方法可以启动一个新的线程，run 方法不能；
	start：不能被重复调用，run 方法可以。
	start：实现了多线程，run 方法没有实现多线程；
	start：方法中的 run 方法中的代码可以不执行完，即可进行线程切换，而 run方法就不行，它要从头执行到尾一步一步来。

	
### 52、创建线程池有哪几种方式？
	
	ExecutorService es = Executors.newCachedThreadPool();	-- 创建一个可缓存线程池，如果线程池长度超过处理需要，可回收空闲的线程，若无可回收，则会创建新线程。
	
	Executors.newFixedThreadPool(); 	-- 创建一个定长线程池，如果线程超出会在队列等待。
	
	Executors.newScheduledThreadPool();	 -- 创建一个定长线程池，支持定时及周期性任务。

	Executors.newSingleThreadExecutor(); 	-- 创建一个单线程化的线程池，它只会用唯一的线程来执行任务，保证所有的任务按照FIFO，LIFO顺序执行。


	英语： 	Executors	-- E谢可QTS
		Cached		-- 卡取t
		Thread		-- 夫略T
		Pool		-- 普
		Fixed		-- 菲克斯T
		Scheduled	-- 斯戈爪
		Single		-- 性狗

### 53、线程池都有哪些状态？
	
	Running、ShutDown、Stop、Tidying、Terminated

	英语：	Running		-- 略宁
		ShutDown	-- 叔党
		Stop		-- 斯夺
		Tidying		-- 太理颖
		Terminated	-- 太尔美贴

### 54、线程池中 submit() 和 execute() 有什么区别？
	
	
	
### 55、在 java 程序中怎么保证多线程的运行安全？
	
	synchronized关键字，ReentrantLock对象（实现了Lock接口）

	英语：	synchronized -- 性库奶斯特
		Reentrant	-- V恩取
		Lock		-- 洛克

### 56、多线程锁的升级原理是什么？
	
	在 Java 中，锁共有4种状态，级别是从低到高依次为：无状态锁、偏向锁、轻量集锁、重量级锁，锁可以升级但不能降级。 
	

### 57、 什么是死锁？

	 当线程 A 持有独占锁 a 时，并尝试去获取独占锁 b 的同时，线程 B 持有独占锁 b，并尝试去获取独占锁 a 的情况下，就会发生 AB 两个线程发生互相持有对方需要的锁，而发生阻塞现象，我们称为死锁。
	
	1、互斥条件：一个资源每次只能被一个线程使用。
	2、请求与保持条件： 一个线程因请求资源而阻塞时，对已获得的资源保持不变。
	3、不可抢占条件：线程已获得资源时，在为使用完之前，是不能抢占的。
	4、循环等待条件： 若干线程之间形成一种头尾相接的循环等待资源关系


### 58、怎么防止死锁？
	
	1、设置加锁顺序：当多个线程需要相同的锁时，每个线程给予不同的顺序，按顺序排队执行。
	2、设置加锁时限：当获取锁的时候尝试加一个获取锁的时间，超过这个时间，就放弃操作。
	3、死锁检测: 是更好的死锁预防机制，主要针对于哪些不可能按序加锁，并锁超时不可行的场景。

### 59、ThreadLocal 是什么？ 有哪些使用场景？
	
	ThreadLocal: 	1、是一个关于创建线程局部变量的类。
			2、通常的情况下，我们创建的变量是可以被任何一个线程访问和修改的。而使用了 ThreadLocal 创建的变量只能被，当前线程访问，其他线程无法访问和修改。	
	
	场景：	1、实现单个线程单例以及单个线程上下文信息存储，比如：交易的ID
		2、实现线程安全，非线程安全的对象使用了 ThreadLocal 之后就会变得线程安全，因为每个线程都会有对应的实例。
		3、承载一些线程相关的数据，避免在方法中来回传递参数。
		 
   
	英语： Thread	-- 夫略T
		Local   -- 楼阁

### 60、说一下 synchronized 底层实现原理

	1、 普通同步方法，锁是当前实例对象。
	2、 静态同步方法，锁是当前类的类对象
	3、同步方法块，锁是括号里面的对象。

		
	synchronized 可以保证方法或者代码块在运行时，同一时刻只有一个方法可以进入到临界区，同时它还可以保证共享变量的内存可见性。


	英语：性库奶斯特


### 69、synchronized 和 volatile 的区别是什么？

	1、volatile 只能使用在变量上，而 synchronized 则可以使用在类、方法、变量上。
	2、volatile 只能实现变量的修改可见性，不能保证原子性，而 synchronized 可以保证可见性和原子性。
	3、volatile 不会造成线程的阻塞， synchronized 可能会造成线程的阻塞。
	4、volatile 标记的变量不会被编译器优化，synchronized 标记的变量可以被编译器优化。
	

	英语：  volatile	-- 娃 e 丑
		synchronized	-- 性库奶斯特

### 70、synchronized 和 Lock 有什么区别？
	
	1、synchronized 是一个关键字，而 Lock 是一个接口。
	2、synchronized 是阻塞、可重入、非公平锁；Lock 是可重入、公平非公平都有实现。
	3、synchronized 是由 jvm 自动释放， lock 是需要有程序释放。
	

	英语： 	synchronized 	-- 性库奶斯特
	 	Lock		-- 洛克

### 71、synchronized 和 ReentrantLock 区别是什么？

	1、synchronized 是一个关键字，而 ReentrantLock是一个 Lock 接口的实现类。
	2、synchronized 是由 jvm 自动释放锁的，而 ReentrantLock 可以使用 unlock() 方法进行解锁。
	3、ReentrantLock 可以判断是否获取所，而 synchronized 不行。

	英语： 	synchronized  	--  性库奶斯特
		Reentrant	--  V恩取
		Lock		-- 洛克

### 72、说一下 atomic 的原理？

	
	英语：	atomic		-- 饿拖美课

##  四、反射

### 73、什么是反射？

	反射：指程序可以访问、检测和修改它本身状态或行为的一种能力

	主要用途：
		  1、获取类型的相关信息
		  2、动态调用方法
		  3、动态构造对象
		  4、从程序集中获得类型。

### 74、什么是 java 序列化？ 什么情况下需要序列化？
	
	1、序列化就是一种用来处理对象流的机制，所谓对象流就是将内容转为二进制。
	2、可以对流化后的对象进行读写操作，也可以将流化后的对象进行网络传输。
	3、序列化是为了解决对象进行读写操作时，所引发的问题。
	4、使用官方的话来说：把对象转换为字节序列的过程称为"序列化", 把字节序列恢复为对象的过程称为‘"反序列化"。


### 75、动态代理什么？ 有哪些应用？

### 76、怎么实现动态代理？

## 五、异常

### 77、throw 和 throws 的区别？

### 78、final、finally、finalize 有什么区别？

### 79、try-catch-finally 中那部分可以省略？

### 80、try-catch-finall，如果 catch 中 return 了， finally 还会执行吗？

### 81、常见的异常类有哪些？

## 六、对象拷贝

### 82、为什么要使用克隆？

### 83、如何是西安对象克隆？

### 84、深拷贝和浅拷贝区别是什么？

## 七、Java Web

### 85、jsp 和 servlet 有什么区别？

### 86、jsp 有哪些内置对象？ 作用分别是什么？

### 87、说一下 jsp 的 4 种作用域？

### 88、session 和 cookie 有什么区别？

### 89、如果客户端禁止 cookie 能实现 session 还能用吗？

### 90、如何避免 sql 注入？

### 91、什么是 XSS 攻击， 如何避免？

### 92、什么是 CSRF 攻击， 如何避免？

## HTTP 协议

### 93、HTTP 响应码 301 和 302 代表的是什么？有什么区别？

### 94、forward 和 redirect 的区别？

### 95、简述 tcp 和 udp 的区别？

### 96、说一下 tcp 粘包是怎么产生的？

### 97、OSI 的七层模式都有哪些？

### 98、get 和 post 请求有哪些区别？

### 99、如何实现跨域？

### 100、 说一些 JSONP 实现原理？

## 九、设计模式

### 101、说一下你熟悉的设计模式？

### 102、简单工厂和抽象工厂有什么区别？

## Spring/Spring MVC

### 103、为什么要使用 spring ？

### 104、解释一下什么是 aop？

### 105、解释一下什么是 ioc？

### 106、spring 有哪些主要模块？

### 107、spring常用的注入方式有哪些？

### 108、spring 中 bean 是线程安全的吗？

### 109、spring 支持几种 bean 的作用域？

### 110、spring 自动装配 bean 有哪些方式？

### 111、spring 事务实现方式有哪些？

### 112、说一下 spring 的事务隔离？

### 113、说一下 spring mvc 运行流程？

### 114、spring mvc 和 struts 的区别是什么？

### 115、spring mvc 有哪些组件？

### 116、@RequestMapping 的作用是什么？

### 117、@Autowired 的作用是什么？

## 十一、Spring Boot/ Spring Cloud

### 118、什么是 Spring Boot ？

### 119、为什么要用 Spring boot？

### 120、Spring boot 核心配置文件是什么？

### 129、spring boot 有哪些方式可以实现热部署？

### 130、jpa 和 hibernate 有什么区别？

### 131、什么是 Spring cloud？

### 132、spring cloud 断路器的作用是什么？

### 133、spring cloud 的核心组件有哪些？

## 十二、MySQL

### 134、数据库的三大范式是什么？

### 135、如何获取当前数据库版本？

### 136、说一下 ACID 是什么？

### 137、char 和 varchar 的区别是什么？

### 138、float 和 double 的区别是什么？

### 139、mysql 的内连接、左连接、右连接有什么区别？

### 140、mysql 索引是怎么实现的？

### 141、怎么验证 mysql 的索引是否满足需求？

### 142、说一下数据库的事务隔离？

### 143、说一下 mysql 常用的引擎？

### 144、 mysql 问题排查都有哪些手段？

### 145、如何做 mysql 的性能优化？

## 十三、 Redis

### 146、redis 是什么？ 都有哪些使用场景？

### 147、redis 有哪些功能？

### 148、redis 和 memecache 有什么区别？

### 149、redis 为什么是单线程的？

### 150、什么是缓存穿透？ 怎么解决？

### 151、redis 支持的数据类型有哪些？

### 152、redis 支持的 java 客户端都有哪些？

### 153、jedis 和 redisson 有哪些区别？

### 154、怎么保证缓存和数据库数据的一致性？

### 155、redis 持久化有几种方式？

### 156、redis 怎么实现分布式锁？

### 157、redis 分布式锁有什么缺陷？

### 158、redis 如何做内存优化？

### 159、redis 淘汰策略有哪些？

### 160、redis 常见的性能问题有哪些？ 该如何解决？
