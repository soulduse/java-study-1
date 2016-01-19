package string;

/**
 * Created by sould on 2016-01-18.
 */
public class StringChange {

    public static void main(String[] args) {
        String msg = "dev32.rayis.co.kr:9094";


        System.out.println(msg);
        String [] urlSplit = msg.split(":");
        int port = Integer.parseInt(urlSplit[1]);
        String socketPort = (port+1)+"";
        System.out.println(urlSplit[0]);

        int strLength = msg.length();
        int portNum = Integer.parseInt(msg.substring(strLength-4,strLength));

        System.out.println(socketPort);
        System.out.println(portNum+1);
    }


//    public String socketIpCallBack(String ori) {
//        String serverip = KSCloudData.WD_CFG.serverIp;
//        String[] urlSplit = serverip.split(":");
//        int portNum = Integer.parseInt(urlSplit[1])+1;
//        String socketIp = "http://"+urlSplit[0]+":"+portNum;
//        return socketIp;
//    }
}
