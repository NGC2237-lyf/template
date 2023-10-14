package tyut.selab.geoguard.common.utils;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

/**
 * 国际化
 */
public class MessageUtils {
    private static MessageSource messageSource;

    public static String getMessage(int code){
        return getMessage(code, new String[0]);
    }

    public static String getMessage(int code, String... params){
        return messageSource.getMessage(code+"", params, LocaleContextHolder.getLocale());
    }
}
