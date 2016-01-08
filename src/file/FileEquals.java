package file;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Created by sould on 2016-01-06.
 */
public class FileEquals {

    public static void main(String[] args) throws Exception{
        File path = new File("aaa") ;
        File[] list = path.listFiles() ;            // 파일 리스트 가져오기


        for(int j=0 ; j < list.length; j++){
            System.out.println(checkSumMaker(list[j].getAbsolutePath()));
            System.out.println(FileChecksum(list[j].getAbsolutePath()));
            System.out.println();
        }
    }

    public static String FileChecksum(String file)
    {
        FileInputStream fis = null;
        MessageDigest checksum = null;

        try {
            checksum = MessageDigest.getInstance("sha-1");
            checksum.reset();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }

        int numread = 0;

        byte[] buffer = new byte[4096];


        File cfile = new File(file);
        try {

            fis = new FileInputStream(cfile.toString());
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        try {
            while ((numread = fis.read(buffer, 0, 4096)) == 4096)
                checksum.update(buffer);

            fis.close();
        } catch (IOException e) {
            return null;
        }

        if (numread > 0) {
            checksum.update(buffer, 0, numread);
        }

        String result = convertToHex(checksum.digest());
        //Log.v(log, "getChecksum(): " + result);
        return result;
    }

    private static String convertToHex(byte[] data) {
        if (data == null)
            return null;

        final StringBuilder hex = new StringBuilder(2 * data.length);

        for (final byte b : data)
            hex.append(String.format("%02X", b));

        return hex.toString();
    }

    public static String checkSumMaker(String datafile) throws Exception{
        String result = "";

        MessageDigest md = MessageDigest.getInstance("SHA1");
        FileInputStream fis = new FileInputStream(datafile);
        byte[] dataBytes = new byte[1024];

        int nread = 0;

        while ((nread = fis.read(dataBytes)) != -1) {
            md.update(dataBytes, 0, nread);
        };

        byte[] mdbytes = md.digest();

        //convert the byte to hex format
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < mdbytes.length; i++) {
            sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }

        result = sb.toString();
//        System.out.println("Digest(in hex format):: " + sb.toString());

        return result.toUpperCase();
    }
}
