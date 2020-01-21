package chilly.java.heima.demo;

public class summarize01 {

	public static void main(String[] args) {
		/**
		   1:关键字(掌握)
				(1)被Java语言赋予特定含义的单词
				(2)特点：
					全部小写。
				(3)注意事项：
					A:goto和const作为保留字存在。
					B:类似于Notepad++这样的高级记事本会对关键字有特殊颜色标记
			
			2:标识符(掌握)
				(1)就是给类，接口，方法，变量等起名字的字符序列
				(2)组成规则：
					A:英文大小写字母
					B:数字
					C:$和_
				(3)注意事项：
					A:不能以数字开头
					B:不能是java中的关键字
					C:区分大小写
				(4)常见的命名规则(见名知意)
					A:包	全部小写
						单级包：小写
							举例：liuyi,com
						多级包：小写，并用.隔开
							举例：cn.itcast,com.baidu				
					B:类或者接口
						一个单词：首字母大写
							举例：Student,Demo
						多个单词：每个单词首字母大写
							举例：HelloWorld,StudentName
					C:方法或者变量
						一个单词：首字母小写
							举例：name,main
						多个单词：从第二个单词开始，每个单词首字母大写
							举例：studentAge,showAllNames()
					D:常量
						全部大写
						一个单词：大写
							举例：PI
						多个单词：大写，并用_隔开
							举例：STUDENT_MAX_AGE
			
			3:注释(掌握)
				(1)就是对程序进行解释说明的文字
				(2)分类：
					A:单行注释
					B:多行注释
					C:文档注释(后面讲)
				(3)把HelloWorld案例写了一个带注释的版本。
					后面我们要写一个程序的过程。
					需求：
					分析：
					实现：
					代码体现：
				(4)注释的作用
					A:解释说明程序，提高了代码的阅读性。
					B:可以帮助我们调试程序。
						后面我们会讲解一个更高端的一个调试工具
			
			4:常量(掌握)
				(1)在程序执行的过程中，其值不发生改变的量
				(2)分类：
					A:字面值常量
					B:自定义常量(后面讲)
				(3)字面值常量
					A:字符串常量 "hello"
					B:整数常量	12,23
					C:小数常量	12.345
					D:字符常量	'a','A','0'
					E:布尔常量	true,false
					F:空常量	null(后面讲)
				(4)在Java中针对整数常量提供了四种表现形式
					A:二进制	由0，1组成。以0b开头。
					B:八进制	由0，1，...7组成。以0开头。
					C:十进制	由0，1，...9组成。整数默认是十进制。
					D:十六进制	由0，1，...9,a,b,c,d,e,f(大小写均可)组成。以0x开头。
			
			5:进制转换(了解)
				(1)其他进制到十进制
					系数：就是每一个位上的数值
					基数：x进制的基数就是x
					权：对每一个位上的数据，从右，并且从0开始编号，对应的编号就是该数据的权。
					
					结果：系数*基数^权次幂之和。
				(2)十进制到其他进制
					除基取余，直到商为0，余数反转。
				(3)进制转换的快速转换法
					A:十进制和二进制间的转换
						8421码。
					B:二进制到八进制，十六进制的转换
			
			6:变量(掌握)
				(1)在程序的执行过程中，其值在某个范围内可以发生改变的量
				(2)变量的定义格式：
					A:数据类型 变量名 = 初始化值;
					B:数据类型 变量名;
					  变量名 = 初始化值;
			
			7:数据类型(掌握)
				(1)Java是一种强类型语言，针对每种数据都提供了对应的数据类型。
				(2)分类：
					A:基本数据类型：4类8种
					B:引用数据类型：类，接口，数组。
				(3)基本数据类型
					A:整数			占用字节数
						byte			1
						short			2
						int 			4
						long			8
					B:浮点数
						float			4
						double			8
					C:字符
						char			2
					D:布尔
						boolean			1
						
					注意：
						整数默认是int类型，浮点数默认是double。
						
						长整数要加L或者l。
						单精度的浮点数要加F或者f。
			
			8:数据类型转换(掌握)
				(1)boolean类型不参与转换
				(2)默认转换
					A:从小到大
					B:byte,short,char -- int -- long -- float -- double
					C:byte,short,char之间不相互转换，直接转成int类型参与运算。
				(3)强制转换
					A:从大到小
					B:可能会有精度的损失，一般不建议这样使用。
					C:格式：
						目标数据类型 变量名 = (目标数据类型) (被转换的数据);
				(4)思考题和面试题：
					A:下面两种方式有区别吗?
						float f1 = 12.345f;
						float f2 = (float)12.345;
						有区别，f1直接是float类型，f2是double类型转换成float类型
					B:下面的程序有问题吗，如果有，在哪里呢?
						byte b1 = 3;
						byte b2 = 4;
						byte b3 = b1 + b2; (有问题，会损失精度)
						byte b4 = 3 + 4;
					C:下面的操作结果是什么呢?
						byte b = (byte)130;
					D:字符参与运算
						是查找ASCII里面的值
						'a'		97
						'A'		65
						'0'		48
						
						System.out.println('a');
						System.out.println('a' + 1);
					E:字符串参与运算
						这里其实是字符串的连接
						
						System.out.println("hello"+'a'+1); // helloa1
						System.out.println('a'+1+"hello"); // 98hello
						System.out.println("hello" + 1 + 'a'); // hello1a
						System.out.println("5+5="+5+5); // 5 + 5 = 55
						System.out.println(5+5+"=5+5"); // 10 = 5 + 5
		 */
		System.out.println("hello"+'a'+1);
		System.out.println('a'+1+"hello");
		System.out.println("hello" + 1 + 'a');
		System.out.println("5+5="+5+5);
		System.out.println(5+5+"=5+5");
	}

}
