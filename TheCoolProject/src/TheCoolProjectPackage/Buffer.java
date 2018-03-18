package TheCoolProjectPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public String buf;

    public Buffer() throws IOException {
        this.buf = reader.readLine();
    }
}
