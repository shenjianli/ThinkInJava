package com.shen.think.exception;

/**
 * Created by ljq on 2017/12/15.
 */

public class TestPresenter implements Presenter {
    @Override
    public void test() throws SimpleException {

    }


    public static void main(String[] args){
        Presenter presenter = new TestPresenter();
        /**
         * 要求进行异常处理
         */
        try {
            presenter.test();
        } catch (SimpleException e) {
            e.printStackTrace();
        }


    }
}
