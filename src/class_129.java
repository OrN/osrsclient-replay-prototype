import java.applet.Applet;
import netscape.javascript.JSObject;

// $FF: renamed from: ah
public class class_129 {

    // $FF: renamed from: v (java.applet.Applet, java.lang.String, int) void
   public static void method_2852(Applet var0, String var1, int var2) throws Throwable {
      try {
         JSObject.getWindow(var0).eval(var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ah.v(" + ')');
      }
   }

   // $FF: renamed from: n (java.applet.Applet, java.lang.String, int) java.lang.Object
   public static Object method_2853(Applet var0, String var1, int var2) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, (Object[])null);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ah.n(" + ')');
      }
   }

   // $FF: renamed from: f (java.applet.Applet, java.lang.String, java.lang.Object[], short) java.lang.Object
   public static Object method_2854(Applet var0, String var1, Object[] var2, short var3) throws Throwable {
      try {
         return JSObject.getWindow(var0).call(var1, var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ah.f(" + ')');
      }
   }

}
