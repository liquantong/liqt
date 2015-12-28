package com.lqt.nife;

import com.lqt.model.NifeModel;
import com.lqt.model.QiXingNife;

public class QiingNifeFactory implements INifeFactory{

	@Override
	public NifeModel createNife() {
		// TODO Auto-generated method stub
		return new QiXingNife();
	}

}
