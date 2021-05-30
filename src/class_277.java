
// $FF: renamed from: im
public abstract class class_277 {

   // $FF: renamed from: ry int
   static int field_3222;
   // $FF: renamed from: f int
   public static final int field_3223 = 12;


   // $FF: renamed from: f (byte) byte[]
   abstract byte[] method_5132();

   // $FF: renamed from: l () byte[]
   abstract byte[] method_5133();

   // $FF: renamed from: y (byte[], byte) void
   abstract void method_5134(byte[] var1);

   // $FF: renamed from: p (byte[], boolean) java.lang.Object
   public static Object method_5135(byte[] var0, boolean var1) {
      if(null == var0) {
         return null;
      } else if(var0.length > 136) {
         class_278 var10000 = new class_278();
         class_278 var2 = var10000;
         var2.method_5134(var0);
         return var2;
      } else if(var1) {
         int var3 = var0.length;
         byte[] var4 = new byte[var3];
         System.arraycopy(var0, 0, var4, 0, var3);
         return var4;
      } else {
         return var0;
      }
   }

   // $FF: renamed from: j (byte[], boolean) java.lang.Object
   public static Object method_5136(byte[] var0, boolean var1) {
      if(null == var0) {
         return null;
      } else if(var0.length > 136) {
         class_278 var10000 = new class_278();
         class_278 var2 = var10000;
         var2.method_5134(var0);
         return var2;
      } else if(var1) {
         int var3 = var0.length;
         byte[] var4 = new byte[var3];
         System.arraycopy(var0, 0, var4, 0, var3);
         return var4;
      } else {
         return var0;
      }
   }

   // $FF: renamed from: <init> () void
   class_277() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: b (java.lang.Object, boolean) byte[]
   public static byte[] method_5138(Object var0, boolean var1) {
      if(null == var0) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if(var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if(var0 instanceof class_277) {
         class_277 var2 = (class_277)var0;
         return var2.method_5132();
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: d (java.lang.Object, boolean) byte[]
   public static byte[] method_5139(Object var0, boolean var1) {
      if(null == var0) {
         return null;
      } else if(var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if(var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if(var0 instanceof class_277) {
         class_277 var2 = (class_277)var0;
         return var2.method_5132();
      } else {
         throw new IllegalArgumentException();
      }
   }

   // $FF: renamed from: n (jv, int, int, int) op
   static class_66 method_5140(class_306 var0, int var1, int var2, int var3) {
      try {
         if(!class_370.method_6606(var0, var1, var2, (byte)89)) {
            if(var3 != 1690865732) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_66 var10000 = new class_66();
            class_66 var5 = var10000;
            var5.field_497 = class_403.field_4276 * -1099363635;
            var5.field_494 = class_380.field_4201 * -821679425;
            var5.field_495 = class_223.field_2529[0];
            var5.field_496 = class_284.field_3260[0];
            var5.field_498 = class_403.field_4278[0];
            var5.field_492 = class_318.field_3787[0];
            var5.field_491 = class_192.field_2300;
            var5.field_493 = class_403.field_4279[0];
            class_192.method_3958();
            return var5;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: c (byte[]) void
   abstract void method_5141(byte[] var1);

   // $FF: renamed from: s () byte[]
   abstract byte[] method_5142();

   // $FF: renamed from: o (byte[]) void
   abstract void method_5143(byte[] var1);

   // $FF: renamed from: r (byte[], boolean) java.lang.Object
   public static Object method_5144(byte[] var0, boolean var1) {
      if(null == var0) {
         return null;
      } else if(var0.length > 136) {
         class_278 var10000 = new class_278();
         class_278 var2 = var10000;
         var2.method_5134(var0);
         return var2;
      } else if(var1) {
         int var3 = var0.length;
         byte[] var4 = new byte[var3];
         System.arraycopy(var0, 0, var4, 0, var3);
         return var4;
      } else {
         return var0;
      }
   }

   // $FF: renamed from: u () byte[]
   abstract byte[] method_5145();
}
