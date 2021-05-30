
// $FF: renamed from: il
public class class_283 {

   // $FF: renamed from: d int
   static final int field_3251 = 4;
   // $FF: renamed from: b int
   public static final int field_3252 = 37;
   // $FF: renamed from: cs char
   public static char field_3253;
   // $FF: renamed from: v id
   static class_276 field_3254;
   // $FF: renamed from: j int
   static int field_3255;


   // $FF: renamed from: b (nd) java.lang.String
   public static String method_5179(class_28 var0) {
      return class_271.method_5058(var0, 32767, (byte)112);
   }

   // $FF: renamed from: p (id) void
   public static void method_5180(class_276 var0) {
      field_3254 = var0;
   }

   // $FF: renamed from: j (id) void
   public static void method_5181(class_276 var0) {
      field_3254 = var0;
   }

   // $FF: renamed from: r (nd, java.lang.String) int
   public static int method_5182(class_28 var0, String var1) {
      int var2 = var0.field_15 * -442398587;
      byte[] var3 = class_96.method_1782(var1, (byte)1);
      var0.method_154(var3.length, 1514054821);
      var0.field_15 += field_3254.method_5128(var3, 0, var3.length, var0.field_12, -442398587 * var0.field_15, -1771956050) * -1025691571;
      return -442398587 * var0.field_15 - var2;
   }

   // $FF: renamed from: n (java.lang.String, int, byte) boolean
   static boolean method_5183(String var0, int var1, byte var2) {
      try {
         return class_90.method_1602(var0, var1, "openjs", 595739519);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "il.n(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   void method_5184() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "il.<init>(" + ')');
      }
   }

   // $FF: renamed from: s (nd, int) java.lang.String
   static String method_5185(class_28 var0, int var1) {
      try {
         int var2 = var0.method_144((byte)30);
         if(var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.field_15 += field_3254.method_5130(var0.field_12, var0.field_15 * -464738479, var3, 0, var2, 2146602048) * -1025691571;
         String var4 = class_135.method_2948(var3, 0, var2, (byte)55);
         return var4;
      } catch (Exception var5) {
         return "Cabbage";
      }
   }

   // $FF: renamed from: d (nd, int) java.lang.String
   static String method_5186(class_28 var0, int var1) {
      try {
         int var2 = var0.method_144((byte)72);
         if(var2 > var1) {
            var2 = var1;
         }

         byte[] var3 = new byte[var2];
         var0.field_15 += field_3254.method_5130(var0.field_12, var0.field_15 * 285663059, var3, 0, var2, 2147071722) * -1025691571;
         String var4 = class_135.method_2948(var3, 0, var2, (byte)95);
         return var4;
      } catch (Exception var5) {
         return "Cabbage";
      }
   }
}
