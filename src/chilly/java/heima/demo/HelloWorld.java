package chilly.java.heima.demo;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

/*
 * 0b 二进制 ； 0 八进制 ； 0x 十六进制
 * 【任意进制转换成十进制】
 * 系数：每个位上的数据值本身就是系数
 * 基数：x进制的基数就是x
 * 权：针对每个位上的数据进行编号，从右边，并且是从0开始编号
 * 公式：系数*基数**权
 * 例：八进制2345转换成十进制1253
 * 2345 => 2 * (8 ** 3) + 3 * (8 ** 2) + 4 * (8 ** 1) + 5 * (8 ** 0)
 * 		= 1024 + 192 + 32 + 5
 * 结果为1253
 * 
 * 
 * 【十进制转换成任意进制】
 * 十进制转换为八进制
 * 除基取余，直到商为0，余数反转
 * 2345 => 2345 / 8 = 293[1] / 8 = 36[5] / 8 = 4[4] / 8 = 0[4]
 * 结果为4451
 * 
 * 【快速方法8421码，是bcd码的一种】
 * 二进制    1    1    1    1    1    1    1    1
 * 十进制  128  64   32   16    8    4    2    1
 * 二进制到十进制的转换： 1010100 = 01010100 = 0 * 128 + 1 * 64 * 0 * 32 + 1 * 16 + 0 * 8 + 1 * 4 + 0 * 2 + 0 * 1 = 84
 * 十进制到二进制的转换： 100 = 0 * 128 + 1 * 64 + 1 * 32 + 0 * 16 + 0 * 8 + 1 * 4 + 0 * 2 + 0 * 1 = 01100100
 * 
 * 【x进制转换为y进制】
 * 1、二进制到十进制，十进制到八或十六进制
 * 2、拆分组合法
 * 0b1011001			八进制
 * 方式1：
 * 0b1011001 = 64 + 16 + 8 + 1 = 89
 * 89 => 89 / 8 = 11[1] / 8 = 1[3] / 8 = 0[1]
 * 结果为： 0131
 * 方式2：
 * 0b1011001
 * 		001		011		001
 * 		1		3		1
 * 结果为0131
 * 
 * 
 * 正数的原码最高位是0，负数的原码最高位是1，其它的是数值位
 * 正数的反码与原码相同，负数的反码与原码符号位相同，数值位取反
 * 正数的补码与原码相同，负数的补码是在反码的基础上加1
 * +7  -7
 * 原码：+7  0 0000111		-7	1 0000111
 * 反码：+7	0 0000111		-7	1 1111000
 * 补码：+7	0 0000111		-7	1 1111001
 **/