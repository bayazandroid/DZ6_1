package com.company;

import java.nio.channels.SelectionKey;
import java.rmi.Remote;
import java.rmi.server.Operation;
import java.rmi.server.RemoteCall;
import java.rmi.server.Skeleton;

public class Main {

    public static void main(String[] args){
        Boss baiden =new Boss();
       baiden. setHeight(250);
       baiden. setDamage(20);
       Sistem.out. printin(baiden.info);
        Skeleton skeleton = new Skeleton() {
            @Override
            public void dispatch(Remote obj, RemoteCall theCall, int opnum, long hash) throws Exception {

            }

            @Override
            public Operation[] getOperations() {
                return new Operation[0];
            }
        }
    }
}
