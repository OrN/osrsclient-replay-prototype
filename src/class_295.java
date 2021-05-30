import java.io.IOException;

// $FF: renamed from: jd
public class class_295 implements class_14 {

   // $FF: renamed from: j jd
   public static final class_295 field_3342;
   // $FF: renamed from: v jd
   public static final class_295 field_3343;
   // $FF: renamed from: f jd
   public static final class_295 field_3344;
   // $FF: renamed from: y jd
   public static final class_295 field_3345;
   // $FF: renamed from: p jd
   public static final class_295 field_3346;
   // $FF: renamed from: r java.lang.String
   public final String field_3347;
   // $FF: renamed from: n jd
   public static final class_295 field_3348;
   // $FF: renamed from: b int
   final int field_3349;
   // $FF: renamed from: qa int
   static final int field_3350 = 1536;


   // $FF: renamed from: f () int
   public int method_51() {
      return -1940949795 * this.field_3349;
   }

   // $FF: renamed from: v (int) int
   public int method_50(int var1) {
      try {
         return 1213598965 * this.field_3349;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "jd.v(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_5315() {
      class_295 var10000 = new class_295;
      var10000.method_5316("runescape", "RuneScape", 0);
      field_3343 = var10000;
      var10000 = new class_295;
      var10000.method_5316("stellardawn", "Stellar Dawn", 1);
      field_3348 = var10000;
      var10000 = new class_295;
      var10000.method_5316("game3", "Game 3", 2);
      field_3344 = var10000;
      var10000 = new class_295;
      var10000.method_5316("game4", "Game 4", 3);
      field_3345 = var10000;
      var10000 = new class_295;
      var10000.method_5316("game5", "Game 5", 4);
      field_3346 = var10000;
      var10000 = new class_295;
      var10000.method_5316("oldscape", "RuneScape 2007", 5);
      field_3342 = var10000;
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return 1213598965 * this.field_3349;
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, int) void
   void method_5316(String var1, String var2, int var3) {
      try {
         super();
         this.field_3347 = var1;
         this.field_3349 = 1698250589 * var3;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "jd.<init>(" + ')');
      }
   }

   // $FF: renamed from: v (boolean, byte) void
   public static void method_5317(boolean var0, byte var1) {
      try {
         if(class_314.field_3771 == null) {
            if(var1 > 16) {
               ;
            }
         } else {
            try {
               class_28 var10000 = new class_28;
               var10000.method_160(4);
               class_28 var2 = var10000;
               byte var10001;
               if(var0) {
                  if(var1 <= 16) {
                     throw new IllegalStateException();
                  }

                  var10001 = 2;
               } else {
                  var10001 = 3;
               }

               var2.method_210(var10001, 303066737);
               var2.method_115(0, -1756916961);
               class_314.field_3771.method_4132(var2.field_12, 0, 4, -749700647);
            } catch (IOException var5) {
               try {
                  class_314.field_3771.method_4123(1650867413);
               } catch (Exception var4) {
                  ;
               }

               class_314.field_3782 += 447278907;
               class_314.field_3771 = null;
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "jd.v(" + ')');
      }
   }
}
