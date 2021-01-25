package algoimpl.logger.enums;


import java.util.Arrays;

/**
 * @author nishika.garg
 */
public enum SinkType {
    FILE,
    DB,
    CONSOLE,
    NETWORK
    ;

    public static SinkType getSinkType(String sinkType){
        return Arrays.stream(SinkType.values()).filter(x->x.name().equals(sinkType)).findFirst().orElse(CONSOLE);
    }

}
