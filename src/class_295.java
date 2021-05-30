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
   public int method_50() {
      try {
         return 1213598965 * this.field_3349;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_295 var10000 = new class_295("runescape", 0);
      field_3343 = var10000;
      var10000 = new class_295("stellardawn", 1);
      field_3348 = var10000;
      var10000 = new class_295("game3", 2);
      field_3344 = var10000;
      var10000 = new class_295("game4", 3);
      field_3345 = var10000;
      var10000 = new class_295("game5", 4);
      field_3346 = var10000;
      var10000 = new class_295("oldscape", 5);
      field_3342 = var10000;
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return 1213598965 * this.field_3349;
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, int) void
   class_295(String var1, int var3) {
      super();
      try {
         this.field_3347 = var1;
         this.field_3349 = 1698250589 * var3;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
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
               Buffer var10000 = new Buffer(4);
               Buffer var2 = var10000;
               byte var10001;
               if(var0) {
                  if(var1 <= 16) {
                     throw new IllegalStateException();
                  }

                  var10001 = 2;
               } else {
                  var10001 = 3;
               }

               var2.writeByte(var10001);
               var2.method_115(0);
               class_314.field_3771.method_4132(var2.data, 0, 4);
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
         throw class_223.method_4281(var6);
      }
   }
}
