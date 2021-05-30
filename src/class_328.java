import java.util.Iterator;

// $FF: renamed from: ko
public class class_328 implements Iterable {

   // $FF: renamed from: n mf
   class_59 field_3848;
   // $FF: renamed from: v mf
   public class_59 field_3849;


   // $FF: renamed from: o (mf, mf) void
   public static void method_5795(class_59 var0, class_59 var1) {
      if(var0.field_471 != null) {
         var0.method_635();
      }

      var0.field_471 = var1;
      var0.field_469 = var1.field_469;
      var0.field_471.field_469 = var0;
      var0.field_469.field_471 = var0;
   }

   // $FF: renamed from: g () mf
   public class_59 method_5796() {
      class_59 var1 = this.field_3849.field_469;
      if(var1 == this.field_3849) {
         return null;
      } else {
         var1.method_635();
         return var1;
      }
   }

   // $FF: renamed from: n (mf) void
   public void method_5797(class_59 var1) {
      if(var1.field_471 != null) {
         var1.method_635();
      }

      var1.field_471 = this.field_3849.field_471;
      var1.field_469 = this.field_3849;
      var1.field_471.field_469 = var1;
      var1.field_469.field_471 = var1;
   }

   // $FF: renamed from: f (mf, mf) void
   public static void method_5798(class_59 var0, class_59 var1) {
      if(var0.field_471 != null) {
         var0.method_635();
      }

      var0.field_471 = var1;
      var0.field_469 = var1.field_469;
      var0.field_471.field_469 = var0;
      var0.field_469.field_471 = var0;
   }

   // $FF: renamed from: y () mf
   public class_59 method_5799() {
      class_59 var1 = this.field_3849.field_469;
      if(var1 == this.field_3849) {
         return null;
      } else {
         var1.method_635();
         return var1;
      }
   }

   // $FF: renamed from: p () mf
   public class_59 method_5800() {
      return this.method_5801((class_59)null);
   }

   // $FF: renamed from: j (mf) mf
   class_59 method_5801(class_59 var1) {
      class_59 var2;
      if(var1 == null) {
         var2 = this.field_3849.field_469;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3849) {
         this.field_3848 = null;
         return null;
      } else {
         this.field_3848 = var2.field_469;
         return var2;
      }
   }

   // $FF: renamed from: r () mf
   public class_59 method_5802() {
      class_59 var1 = this.field_3848;
      if(var1 == this.field_3849) {
         this.field_3848 = null;
         return null;
      } else {
         this.field_3848 = var1.field_469;
         return var1;
      }
   }

   // $FF: renamed from: <init> () void
   public class_328() {
      super();
      class_59 var10001 = new class_59();
      this.field_3849 = var10001;
      this.field_3849.field_469 = this.field_3849;
      this.field_3849.field_471 = this.field_3849;
   }

   // $FF: renamed from: aj () java.util.Iterator
   public Iterator method_5804() {
      class_321 var10000 = new class_321(this);
      return var10000;
   }

   // $FF: renamed from: b () void
   public void method_5805() {
      while(this.field_3849.field_469 != this.field_3849) {
         this.field_3849.field_469.method_635();
      }

   }

   // $FF: renamed from: d () void
   public void method_5806() {
      while(this.field_3849.field_469 != this.field_3849) {
         this.field_3849.field_469.method_635();
      }

   }

   // $FF: renamed from: v () void
   public void method_5807() {
      while(this.field_3849.field_469 != this.field_3849) {
         this.field_3849.field_469.method_635();
      }

   }

   // $FF: renamed from: u (mf) void
   public void method_5808(class_59 var1) {
      if(var1.field_471 != null) {
         var1.method_635();
      }

      var1.field_471 = this.field_3849.field_471;
      var1.field_469 = this.field_3849;
      var1.field_471.field_469 = var1;
      var1.field_469.field_471 = var1;
   }

   // $FF: renamed from: l (mf, mf) void
   public static void method_5809(class_59 var0, class_59 var1) {
      if(var0.field_471 != null) {
         var0.method_635();
      }

      var0.field_471 = var1;
      var0.field_469 = var1.field_469;
      var0.field_471.field_469 = var0;
      var0.field_469.field_471 = var0;
   }

   // $FF: renamed from: m () mf
   public class_59 method_5810() {
      return this.method_5801((class_59)null);
   }

   // $FF: renamed from: c (mf, mf) void
   public static void method_5811(class_59 var0, class_59 var1) {
      if(var0.field_471 != null) {
         var0.method_635();
      }

      var0.field_471 = var1;
      var0.field_469 = var1.field_469;
      var0.field_471.field_469 = var0;
      var0.field_469.field_471 = var0;
   }

   // $FF: renamed from: w (mf) mf
   class_59 method_5812(class_59 var1) {
      class_59 var2;
      if(var1 == null) {
         var2 = this.field_3849.field_469;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3849) {
         this.field_3848 = null;
         return null;
      } else {
         this.field_3848 = var2.field_469;
         return var2;
      }
   }

   // $FF: renamed from: x () mf
   public class_59 method_5813() {
      return this.method_5801((class_59)null);
   }

   public Iterator iterator() {
      class_321 var10000 = new class_321(this);
      return var10000;
   }

   // $FF: renamed from: k () mf
   public class_59 method_5814() {
      class_59 var1 = this.field_3849.field_469;
      if(var1 == this.field_3849) {
         return null;
      } else {
         var1.method_635();
         return var1;
      }
   }

   // $FF: renamed from: s (mf) void
   public void method_5815(class_59 var1) {
      if(var1.field_471 != null) {
         var1.method_635();
      }

      var1.field_471 = this.field_3849.field_471;
      var1.field_469 = this.field_3849;
      var1.field_471.field_469 = var1;
      var1.field_469.field_471 = var1;
   }

   // $FF: renamed from: a () mf
   public class_59 method_5816() {
      class_59 var1 = this.field_3849.field_469;
      if(var1 == this.field_3849) {
         return null;
      } else {
         var1.method_635();
         return var1;
      }
   }

   // $FF: renamed from: z () mf
   public class_59 method_5817() {
      return this.method_5801((class_59)null);
   }

   // $FF: renamed from: e () mf
   public class_59 method_5818() {
      class_59 var1 = this.field_3849.field_469;
      if(var1 == this.field_3849) {
         return null;
      } else {
         var1.method_635();
         return var1;
      }
   }

   // $FF: renamed from: t (mf) mf
   class_59 method_5819(class_59 var1) {
      class_59 var2;
      if(var1 == null) {
         var2 = this.field_3849.field_469;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3849) {
         this.field_3848 = null;
         return null;
      } else {
         this.field_3848 = var2.field_469;
         return var2;
      }
   }
}
