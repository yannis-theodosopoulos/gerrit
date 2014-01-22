package ivy.test;

import ivy.math.MyMath;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ptv.feed.utils.jaxb.handler.*;

public class Main {
  private static Log m_Log = LogFactory.getLog("Logging...");
    public static void main(String[] args) {
        MyMath math = new MyMath();
        System.out.println("Compiling resources...");
        System.out.println("Result is: " + math.multi(5, 10));
        System.out.println(m_Log);
    }
}