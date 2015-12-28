package com.lqt.test;

import org.junit.Test;

import com.lqt.model.BaXingNife;
import com.lqt.model.QiXingNife;
import com.lqt.nife.BaXingNifeFactory;
import com.lqt.nife.QiingNifeFactory;

public class test {
	@Test
	public void testQiXingNife(){
		QiingNifeFactory nifeFactory = new QiingNifeFactory();
		QiXingNife qiXingNife = (QiXingNife)nifeFactory.createNife();
		System.out.println(qiXingNife.getNife());
	}
	
	@Test
	public void testBaXingNife(){
		BaXingNifeFactory baXingNifeFactory = new BaXingNifeFactory();
		BaXingNife baXingNife = baXingNifeFactory.createNife();
		System.out.println(baXingNife.getNife());
	}
}
