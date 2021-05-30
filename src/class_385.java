
// $FF: renamed from: np
public class class_385 implements class_14 {

   // $FF: renamed from: j java.lang.Class
   public final Class field_4214;
   // $FF: renamed from: n np
   public static final class_385 field_4215;
   // $FF: renamed from: f np
   public static final class_385 field_4216;
   // $FF: renamed from: y int
   final int field_4217;
   // $FF: renamed from: v np
   public static final class_385 field_4218;
   // $FF: renamed from: o int
   public static final int field_4219 = 15;
   // $FF: renamed from: r nv
   final class_23 field_4220;
   // $FF: renamed from: bs int
   public static final int field_4221 = 82;
   // $FF: renamed from: p int
   public final int field_4222;


   // $FF: renamed from: j (java.lang.Object, nd, int) void
   public static void method_6708(Object var0, class_28 var1) {
      try {
         class_23 var3 = method_6712(var0.getClass(), (short)-2594);
         var3.method_73(var0, var1);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> (int, int, java.lang.Class, nv) void
   class_385(int var1, int var2, Class var3, class_23 var4) {
      super();
      try {
         this.field_4217 = var1 * -938134805;
         this.field_4222 = -1491529763 * var2;
         this.field_4214 = var3;
         this.field_4220 = var4;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: y (int) np[]
   public static class_385[] method_6710() {
      try {
         return new class_385[]{field_4218, field_4215, field_4216};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: v (ax, byte) ai
   public static class_1 method_6711(class_144 var0) {
      try {
         switch(var0.field_1822 * -537510065) {
         case 0:
            class_25 var10000 = new class_25();
            return var10000;
         default:
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: r (java.lang.Class, short) nv
   static class_23 method_6712(Class var0, short var1) {
      try {
         class_385 var2 = method_6713(var0, (byte)-58);
         if(var2 == null) {
            if(var1 >= 352) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return var2.field_4220;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (java.lang.Class, byte) np
   public static class_385 method_6713(Class var0, byte var1) {
      try {
         class_385[] var2 = method_6710();

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if(var1 >= 1) {
               throw new IllegalStateException();
            }

            class_385 var4 = var2[var3];
            if(var0 == var4.field_4214) {
               if(var1 >= 1) {
                  throw new IllegalStateException();
               }

               return var4;
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: b (nd, int) java.lang.Object
   public Object method_6714(class_28 var1) {
      try {
         return this.field_4220.method_75(var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_384 var10005 = new class_384();
      class_385 var10000 = new class_385(2, 0, Integer.class, var10005);
      field_4218 = var10000;
      class_390 var0 = new class_390();
      var10000 = new class_385(0, 1, Long.class, var0);
      field_4215 = var10000;
      class_386 var1 = new class_386();
      var10000 = new class_385(1, 2, String.class, var1);
      field_4216 = var10000;
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return 618578037 * this.field_4222;
   }

   // $FF: renamed from: l (java.lang.Object, nd) void
   public static void method_6716(Object var0, class_28 var1) {
      class_23 var2 = method_6712(var0.getClass(), (short)-18494);
      var2.method_73(var0, var1);
   }

   // $FF: renamed from: d () np[]
   public static class_385[] method_6717() {
      return new class_385[]{field_4218, field_4215, field_4216};
   }

   // $FF: renamed from: s (java.lang.Class) np
   public static class_385 method_6718(Class var0) {
      class_385[] var1 = method_6710();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class_385 var3 = var1[var2];
         if(var0 == var3.field_4214) {
            return var3;
         }
      }

      return null;
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return 618578037 * this.field_4222;
   }

   // $FF: renamed from: v (int) int
   public int method_50() {
      try {
         return 618578037 * this.field_4222;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: o (java.lang.Class) nv
   static class_23 method_6719(Class var0) {
      class_385 var1 = method_6713(var0, (byte)-6);
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         return var1.field_4220;
      }
   }

   // $FF: renamed from: c (nd) java.lang.Object
   public Object method_6720(class_28 var1) {
      return this.field_4220.method_75(var1);
   }

   // $FF: renamed from: u (java.lang.Object, nd) void
   public static void method_6721(Object var0, class_28 var1) {
      class_23 var2 = method_6712(var0.getClass(), (short)-28940);
      var2.method_73(var0, var1);
   }
}
