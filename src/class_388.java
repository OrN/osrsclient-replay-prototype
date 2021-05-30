import java.util.Comparator;

// $FF: renamed from: ns
public class class_388 implements Comparator {

   // $FF: renamed from: v boolean
   final boolean field_4232;


   // $FF: renamed from: v (lx, lx, int) int
   int method_6730(class_338 var1, class_338 var2, int var3) {
      try {
         int var10000;
         if(this.field_4232) {
            if(var3 <= -1458307198) {
               throw new IllegalStateException();
            }

            var10000 = var1.method_6000(var2);
         } else {
            var10000 = var2.method_6000(var1);
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_6730((class_338)var1, (class_338)var2, -4111631);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: j (lx, lx) int
   int method_6731(class_338 var1, class_338 var2) {
      return this.field_4232?var1.method_6000(var2):var2.method_6000(var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_6732(Object var1, Object var2) {
      return this.method_6730((class_338)var1, (class_338)var2, 1623935983);
   }

   // $FF: renamed from: <init> (boolean) void
   public class_388(boolean var1) {
      super();
      try {
         this.field_4232 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_6734(Object var1, Object var2) {
      return this.method_6730((class_338)var1, (class_338)var2, -294189724);
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_6735(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_6736(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: n (lx, lx) int
   int method_6737(class_338 var1, class_338 var2) {
      return this.field_4232?var1.method_6000(var2):var2.method_6000(var1);
   }

   // $FF: renamed from: f (lx, lx) int
   int method_6738(class_338 var1, class_338 var2) {
      return this.field_4232?var1.method_6000(var2):var2.method_6000(var1);
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_6739(Object var1) {
      return super.equals(var1);
   }
}
