import java.util.Comparator;

// $FF: renamed from: dv
public class class_204 implements Comparator {

   // $FF: renamed from: gi int
   static int field_2387;
   // $FF: renamed from: h int
   static final int field_2388 = 25;
   // $FF: renamed from: v boolean
   final boolean field_2389;
   // $FF: renamed from: x int
   static final int field_2390 = 7;
   // $FF: renamed from: z int
   static int field_2391;


   // $FF: renamed from: jg (boolean, byte) void
   static void method_4100(boolean var0, byte var1) {
      try {
         client.field_1498 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "dv.jg(" + ')');
      }
   }

   // $FF: renamed from: v (lv, lv, int) int
   int method_4101(class_339 var1, class_339 var2, int var3) {
      try {
         int var10000;
         if(this.field_2389) {
            if(var3 != -903246659) {
               throw new IllegalStateException();
            }

            var10000 = var1.field_3885 * -1023710905 - var2.field_3885 * -1023710905;
         } else {
            var10000 = -1023710905 * var2.field_3885 - var1.field_3885 * -1023710905;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "dv.v(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_4101((class_339)var1, (class_339)var2, -903246659);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "dv.compare(" + ')');
      }
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_4102(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: <init> (boolean) void
   public class_204(boolean var1) {
      super();
      try {
         this.field_2389 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "dv.<init>(" + ')');
      }
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_4104(Object var1, Object var2) {
      return this.method_4101((class_339)var1, (class_339)var2, -903246659);
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_4105(Object var1) {
      return super.equals(var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "dv.equals(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_4106(Object var1, Object var2) {
      return this.method_4101((class_339)var1, (class_339)var2, -903246659);
   }

   // $FF: renamed from: n (lv, lv) int
   int method_4107(class_339 var1, class_339 var2) {
      return this.field_2389?var1.field_3885 * -1023710905 - var2.field_3885 * -1023710905:-1023710905 * var2.field_3885 - var1.field_3885 * -1023710905;
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_4108(Object var1) {
      return super.equals(var1);
   }
}
