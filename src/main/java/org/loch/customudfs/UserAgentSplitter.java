package org.loch.customudfs;
import java.io.IOException;
import ua_parser.Client;
import ua_parser.Parser;


/**
 * Created by lochana on 3/14/16.
 * This is an UDF class supporting user agent string splitting for spark SQL
 */
public class UserAgentSplitter{

    Parser uaParser;

    public UserAgentSplitter() throws IOException {
        uaParser = new Parser();
    }

    public String extractUserAgentFamily(String uaString) {
        Client c = uaParser.parse(uaString);
        return c.userAgent.family;
    }

    public String extractUserAgentMajor(String uaString){
        Client c = uaParser.parse(uaString);
        return c.userAgent.major;
    }
    public String extractOSFamily(String uaString){
        Client c = uaParser.parse(uaString);
        return c.os.family;
    }
    public String extractOSMajor(String uaString){
        Client c = uaParser.parse(uaString);
        return c.os.major;
    }
    public String extractDeviceFamily(String uaString){
        Client c = uaParser.parse(uaString);
        return c.device.family;
    }


}
