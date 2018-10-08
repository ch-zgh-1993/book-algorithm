/*
* @Author: Zhang Guohua
* @Date:   2018-09-13 20:16:08
* @Last Modified by:   zgh
* @Last Modified time: 2018-10-08 20:16:59
* @Description: create by zgh
* @GitHub: Savour Humor
*/
// 第一节： 编程模型
// 
// 基础编程模型： 
// 		静态方法库
// 		
// 模块化编程：
// 		java的模块化编程，是通过静态方法库实现的。许多静态方法库，库中的静态方法可以条用其他库的静态方法。
// 		优势：
// 			分解程序到模块，程序很大，模块大小仍然适中。
// 			可以共享和重用代码而无需重新实现。
// 			很容易改进代码实现，并替换旧的实现
// 			可以为解决问题建立合适的抽象模型
// 			缩小调试范围
// 
// 单元测试：
// 		main() -> 测试用例： 对代码进行全面的测试。 -> 更复杂为测试模块.
// 		
// 外部库：
// 		分为两个类型：
// 			1. 系统标准库： java.lang.*
// 			2. 导入的系统库: java.util.Arrays
// 		我们使用模块化方式编写方法库，能够扩展我们的编程模型。
// 		
// 		
// 	API:
// 		作为模块化编程的重要组成部分，记录库方法的用法，并提供其他人参考的文档。
// 		Math：
// 		Java库: 我们的标准库
// 		为什么有些实现简单的方法，我们还要在库中实现？ 
// 		你自己编写的库：
// 		
// 	字符串：
// 		命令行参数
// 	
// 	输入输出：
// 		交流模型：
// 		命令参数：
// 		标准输出:
// 		标准输入:
// 		
// 		重定向与管道：
// 			重定向输出，也可以从文件中读取内容。
// 			管道：将程序的输出重定向到另一个程序的输入，叫做管道。解决输出流，和运行细节问题。
// 			
// 		基于文件的输入输出：
// 		标准会图库：
// 			在数据分析和算法可视化时使用。
// 			
// 		二分查找：
// 			白名单过滤：
// 			性能:
// 		
// 	展望：
// 		面向对象：
// 
// 		
// 				
// 		
// 第二节： 面向对象：	
// 