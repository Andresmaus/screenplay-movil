package experibank.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ContenedorLogin {

    public static final Target BTN_POPUP_ERIBANK =Target.the("Mensaje EriBank")
            .locatedForAndroid(MobileBy.id("android:id/button1"))
            .locatedForIOS(MobileBy.xpath(""));

    public static final Target TXT_USUARIO =Target.the("clave de usuario")
            .locatedForAndroid(MobileBy.id("com.experitest.ExperiBank:id/usernameTextField"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target TXT_CLAVE = Target.the("clave de usuario")
            .locatedForAndroid(MobileBy.id("com.experitest.ExperiBank:id/passwordTextField"))
            .locatedForIOS(MobileBy.id(""));
    public static final Target BTN_LOGIN_APP = Target.the("Boton ingresar")
            .locatedForAndroid(MobileBy.id("com.experitest.ExperiBank:id/loginButton"))
            .locatedForIOS(MobileBy.id(""));

    public static final Target LBL_SALDO_CUENTA = Target.the("Boton ingresar")
            .locatedForAndroid(MobileBy.id("com.experitest.ExperiBank:id/loginButton"))
            .locatedForIOS(MobileBy.id(""));
    public static final Target BTN_CERRAR_SESION = Target.the("Cerrar sesion")
            .locatedForAndroid(MobileBy.id("com.experitest.ExperiBank:id/logoutButton"))
            .locatedForIOS(MobileBy.id(""));
    public static final Target LBL_USUARIO_INVALIDO = Target.the("Boton ingresar")
            .locatedForAndroid(MobileBy.id("com.experitest.ExperiBank:id/loginButton"))
            .locatedForIOS(MobileBy.id(""));
}
