package exceptions;

import java.io.*;

public class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fname);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("Error till executing in.close()");
            }
            throw e;
        } finally {

        }
    }
    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error till executing readLine()");
        }
        return s;
    }
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() success");
        } catch (IOException e2) {
            throw new RuntimeException("Error till executing in.close()");
        }
    }
}
