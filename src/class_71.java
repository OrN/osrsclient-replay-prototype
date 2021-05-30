
// $FF: renamed from: gd
public class class_71 extends class_59 {

   // $FF: renamed from: w int
   static final int field_560 = 2;
   // $FF: renamed from: r int
   public static final int field_561 = 536870912;
   // $FF: renamed from: v gu[]
   class_252[] field_562;


   // $FF: renamed from: v (int, byte) boolean
   public boolean method_1043(int var1) {
      try {
         return this.field_562[var1].field_2859;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (int) boolean
   public boolean method_1044(int var1) {
      return this.field_562[var1].field_2859;
   }

   // $FF: renamed from: n (int) boolean
   public boolean method_1045(int var1) {
      return this.field_562[var1].field_2859;
   }

   // $FF: renamed from: <init> (jv, jv, int, boolean) void
   public class_71(class_306 var1, class_306 var2, int var3, boolean var4) {
      super();
      try {
         class_335 var10000 = new class_335();
         class_335 var5 = var10000;
         int var6 = var1.method_5393(var3);
         this.field_562 = new class_252[var6];
         int[] var7 = var1.method_5392(var3, (byte)8);
         int var8 = 0;

         while(var8 < var7.length) {
            byte[] var9 = var1.method_5381(var3, var7[var8]);
            class_43 var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;
            class_43 var12 = (class_43)var5.method_5944();

            while(true) {
               if(null != var12) {
                  if(-2039033351 * var12.field_314 != var11) {
                     var12 = (class_43)var5.method_5972();
                     continue;
                  }

                  var10 = var12;
               }

               if(var10 == null) {
                  byte[] var13;
                  if(var4) {
                     var13 = var2.method_5418(0, var11, 791709889);
                  } else {
                     var13 = var2.method_5418(var11, 0, 791709889);
                  }

                  class_43 var15 = new class_43(var11, var13);
                  var10 = var15;
                  var5.method_5939(var10);
               }

               class_252[] var16 = this.field_562;
               int var10001 = var7[var8];
               class_252 var10002 = new class_252(var9, var10);
               var16[var10001] = var10002;
               ++var8;
               break;
            }
         }

      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14);
      }
   }

   // $FF: renamed from: v (int, int) io
   public static class_37 method_1047(int var0) {
      try {
         int var2 = var0 >> 16;
         int var3 = var0 & '\uffff';
         if(null == class_37.field_93[var2] || null == class_37.field_93[var2][var3]) {
            boolean var4 = class_191.method_3957(var2, (byte)-13);
            if(!var4) {
               return null;
            }
         }

         return class_37.field_93[var2][var3];
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }
}
