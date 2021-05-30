
// $FF: renamed from: jn
public class class_304 implements class_14 {

   // $FF: renamed from: p int
   final int field_3396;
   // $FF: renamed from: v jn
   static final class_304 field_3397;
   // $FF: renamed from: f jn
   static final class_304 field_3398;
   // $FF: renamed from: y jn
   static final class_304 field_3399;
   // $FF: renamed from: n jn
   static final class_304 field_3400;
   // $FF: renamed from: af int
   static final int field_3401 = 25;


   // $FF: renamed from: y (int, int, int, eg, int, byte) void
   static void method_5370(int var0, int var1, int var2, class_87 var3, int var4, byte var5) {
      try {
         class_103 var6;
         int var7;
         int var8;
         label46: {
            class_103 var10000 = new class_103();
            var6 = var10000;
            var6.field_1188 = -921901257 * var0;
            var6.field_1198 = -1130410624 * var1;
            var6.field_1191 = -351629440 * var2;
            var7 = var3.field_839 * -288612135;
            var8 = -1812944985 * var3.field_851;
            if(var4 != 1) {
               if(var5 == 0) {
                  throw new IllegalStateException();
               }

               if(var4 != 3) {
                  break label46;
               }

               if(var5 == 0) {
                  throw new IllegalStateException();
               }
            }

            var7 = var3.field_851 * -1812944985;
            var8 = var3.field_839 * -288612135;
         }

         var6.field_1192 = -946193536 * (var1 + var7);
         var6.field_1193 = (var8 + var2) * 924842368;
         var6.field_1195 = var3.field_829 * 931435553;
         var6.field_1194 = var3.field_846 * 1819323520;
         var6.field_1197 = 9959657 * var3.field_847;
         var6.field_1200 = var3.field_848 * 200523271;
         var6.field_1199 = var3.field_849;
         if(null != var3.field_842) {
            if(var5 == 0) {
               return;
            }

            var6.field_1202 = var3;
            var6.method_1917((byte)10);
         }

         class_103.field_1203.method_5939(var6);
         if(var6.field_1199 != null) {
            if(var5 == 0) {
               throw new IllegalStateException();
            }

            var6.field_1190 = (1385478755 * var6.field_1197 + (int)(Math.random() * (double)(var6.field_1200 * -1819837691 - var6.field_1197 * 1385478755))) * -1252270037;
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "jn.y(" + ')');
      }
   }

   // $FF: renamed from: v (int) int
   public int method_50(int var1) {
      try {
         return -1451177967 * this.field_3396;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "jn.v(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_304 var10000 = new class_304(-1);
      field_3397 = var10000;
      var10000 = new class_304(0);
      field_3400 = var10000;
      var10000 = new class_304(1);
      field_3398 = var10000;
      var10000 = new class_304(2);
      field_3399 = var10000;
   }

   // $FF: renamed from: j () jn[]
   public static class_304[] method_5372() {
      return new class_304[]{field_3400, field_3397, field_3398, field_3399};
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return -1451177967 * this.field_3396;
   }

   // $FF: renamed from: p () jn[]
   public static class_304[] method_5373() {
      return new class_304[]{field_3400, field_3397, field_3398, field_3399};
   }

   // $FF: renamed from: <init> (int) void
   class_304(int var1) {
      super();
      try {
         this.field_3396 = 259074289 * var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "jn.<init>(" + ')');
      }
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return 1261210877 * this.field_3396;
   }
}
