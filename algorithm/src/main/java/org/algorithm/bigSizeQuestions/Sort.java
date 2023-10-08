package org.algorithm.bigSizeQuestions;

/**
 * 10G 文件，存有无序 int 类型数据（-2^31 ~ 2^31 - 1），
 * 5G 内存，输出到另一个文件并且有序
 *
 * 小根堆 {num:times}, num 组织的小根堆，一条记录为 两个 int, 8字节，留出富余量按 16 字节算
 * 那么 5G 内存可以开 size 为 5G / 2^4  = 2^30 * 5 / 2^4 = 5* 2^26 取小一些的值，2^27 的小根堆，可分成 2^5组
 * 先取最小一组，输出，二组，输出。。。。直到处理完成
 *
 * 按个数分，大根堆，先找出 n 个最小的数，然后下个范围，继续
 */
public class Sort {
}
