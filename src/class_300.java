import java.util.Comparator;

// $FF: renamed from: jj
final class class_300 implements Comparator {

   // $FF: renamed from: tj int
   static final int field_3372 = 5;
   // $FF: renamed from: l int
   static final int field_3373 = 2048;
   // $FF: renamed from: bn int
   static final int field_3374 = 28;
   // $FF: renamed from: v int
   static final int field_3375 = 22;


   public int compare(Object var1, Object var2) {
      try {
         return this.method_5349((class_310)var1, (class_310)var2, 78911903);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (js, js, int) int
   int method_5349(class_310 var1, class_310 var2, int var3) {
      try {
         int var10000;
         if(512263149 * var1.field_3745 < var2.field_3745 * 512263149) {
            if(var3 == -1536149418) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = 512263149 * var1.field_3745 == var2.field_3745 * 512263149?0:1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_5350(Object var1, Object var2) {
      return this.method_5349((class_310)var1, (class_310)var2, -1402478183);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> () void
   class_300() {
      super();
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_5352(Object var1, Object var2) {
      return this.method_5349((class_310)var1, (class_310)var2, 966414232);
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_5353(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_5354(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_5355(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: n (js, js) int
   int method_5356(class_310 var1, class_310 var2) {
      return 512263149 * var1.field_3745 < var2.field_3745 * -1733902941?-1:(1554663579 * var1.field_3745 == var2.field_3745 * 1098882778?0:1);
   }

   // $FF: renamed from: v (byte[], boolean, int) java.lang.Object
   public static Object method_5357(byte[] var0, boolean var1, int var2) {
      try {
         if(null == var0) {
            if(var2 == 1277514161) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if(var0.length > 136) {
            if(var2 == 1277514161) {
               throw new IllegalStateException();
            } else {
               class_278 var10000 = new class_278();
               class_278 var3 = var10000;
               var3.method_5134(var0);
               return var3;
            }
         } else if(var1) {
            if(var2 == 1277514161) {
               throw new IllegalStateException();
            } else {
               int var4 = var0.length;
               byte[] var5 = new byte[var4];
               System.arraycopy(var0, 0, var5, 0, var4);
               return var5;
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}
