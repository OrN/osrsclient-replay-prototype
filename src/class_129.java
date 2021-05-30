import java.applet.Applet;
import netscape.javascript.JSObject;

// $FF: renamed from: ah
public class class_129 {

   // $FF: renamed from: u (java.applet.Applet, java.lang.String) java.lang.Object
   public static Object method_2851(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

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

   // $FF: renamed from: y (java.applet.Applet, java.lang.String) void
   public static void method_2855(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   // $FF: renamed from: l (java.applet.Applet, java.lang.String, java.lang.Object[]) java.lang.Object
   public static Object method_2856(Applet var0, String var1, Object[] var2) throws Throwable {
      return JSObject.getWindow(var0).call(var1, var2);
   }

   // $FF: renamed from: j (java.applet.Applet, java.lang.String) void
   public static void method_2857(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   // $FF: renamed from: r (java.applet.Applet, java.lang.String) void
   public static void method_2858(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   // $FF: renamed from: b (java.applet.Applet, java.lang.String) java.lang.Object
   public static Object method_2859(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   // $FF: renamed from: d (java.applet.Applet, java.lang.String) java.lang.Object
   public static Object method_2860(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   // $FF: renamed from: s (java.applet.Applet, java.lang.String) java.lang.Object
   public static Object method_2861(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }

   // $FF: renamed from: p (java.applet.Applet, java.lang.String) void
   public static void method_2862(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   // $FF: renamed from: <init> () void
   class_129() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ah.<init>(" + ')');
      }
   }
}
