/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package constants.string;

/*
 * Thanks to GabrielSin (EllinMS) - gabrielsin@playellin.net
 * Ellin
 * MapleStory Server
 * CharsetConstants
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

public class CharsetConstants {

    private static final Logger log = LoggerFactory.getLogger(CharsetConstants.class);

    public static final Charset CHARSET = loadCharset();

    private static Charset loadCharset() {
        return Charset.forName("GBK");
    }

}