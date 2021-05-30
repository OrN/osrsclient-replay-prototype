
// $FF: renamed from: lx
public class class_338 implements Comparable {

   // $FF: renamed from: y ly
   class_359 field_3882;
   // $FF: renamed from: f ly
   class_359 field_3883;
   // $FF: renamed from: ab int
   static final int field_3884 = 2;


   // $FF: renamed from: u (java.lang.Object) int
   public int method_5995(Object var1) {
      return this.method_6000((class_338)var1, 1656574940);
   }

   // $FF: renamed from: am () ly
   public class_359 method_5996() {
      return this.field_3883;
   }

   // $FF: renamed from: ax (byte) java.lang.String
   public String method_5997(byte var1) {
      try {
         if(this.field_3883 == null) {
            if(var1 != 1) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            return this.field_3883.method_6272(2105817014);
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lx.ax(" + ')');
      }
   }

   // $FF: renamed from: as (int) java.lang.String
   public String method_5998(int var1) {
      try {
         return null == this.field_3882?"":this.field_3882.method_6272(2124030292);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lx.as(" + ')');
      }
   }

   // $FF: renamed from: ag (int) ly
   public class_359 method_5999(int var1) {
      try {
         return this.field_3883;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lx.ag(" + ')');
      }
   }

   // $FF: renamed from: n (lx, int) int
   public int method_6000(class_338 var1, int var2) {
      try {
         return this.field_3883.method_6275(var1.field_3883, -2072914472);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "lx.n(" + ')');
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.method_6000((class_338)var1, 539732409);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "lx.compareTo(" + ')');
      }
   }

   // $FF: renamed from: av () ly
   public class_359 method_6001() {
      return this.field_3883;
   }

   // $FF: renamed from: j (lx) int
   public int method_6002(class_338 var1) {
      return this.field_3883.method_6275(var1.field_3883, -1635951693);
   }

   // $FF: renamed from: aj (ly, ly, int) void
   void method_6003(class_359 var1, class_359 var2, int var3) {
      try {
         if(var1 == null) {
            if(var3 <= 1840296514) {
               throw new IllegalStateException();
            } else {
               throw new NullPointerException();
            }
         } else {
            this.field_3883 = var1;
            this.field_3882 = var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "lx.aj(" + ')');
      }
   }

   // $FF: renamed from: r (lx) int
   public int method_6004(class_338 var1) {
      return this.field_3883.method_6275(var1.field_3883, -260389268);
   }

   // $FF: renamed from: s (java.lang.Object) int
   public int method_6005(Object var1) {
      return this.method_6000((class_338)var1, 62836503);
   }

   // $FF: renamed from: d (lx) int
   public int method_6006(class_338 var1) {
      return this.field_3883.method_6275(var1.field_3883, -136171477);
   }

   // $FF: renamed from: l (java.lang.Object) int
   public int method_6007(Object var1) {
      return this.method_6000((class_338)var1, 1442888933);
   }

   // $FF: renamed from: o (java.lang.Object) int
   public int method_6008(Object var1) {
      return this.method_6000((class_338)var1, 320061779);
   }

   // $FF: renamed from: az () ly
   public class_359 method_6009() {
      return this.field_3883;
   }

   // $FF: renamed from: b (lx) int
   public int method_6010(class_338 var1) {
      return this.field_3883.method_6275(var1.field_3883, 619320519);
   }

   // $FF: renamed from: <init> () void
   void method_6011() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "lx.<init>(" + ')');
      }
   }

   // $FF: renamed from: ac () java.lang.String
   public String method_6012() {
      return this.field_3883 == null?"":this.field_3883.method_6272(2136058793);
   }

   // $FF: renamed from: at (ly, ly) void
   void method_6013(class_359 var1, class_359 var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.field_3883 = var1;
         this.field_3882 = var2;
      }
   }

   // $FF: renamed from: ah (ly, ly) void
   void method_6014(class_359 var1, class_359 var2) {
      if(var1 == null) {
         throw new NullPointerException();
      } else {
         this.field_3883 = var1;
         this.field_3882 = var2;
      }
   }
}
