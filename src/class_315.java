import java.util.Comparator;

// $FF: renamed from: jz
final class class_315 implements Comparator {

   // $FF: renamed from: y int
   static final int field_3784 = 4;
   // $FF: renamed from: ki int
   static final int field_3785 = 4;


   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_5598(Object var1, Object var2) {
      return this.method_5599((class_310)var1, (class_310)var2, 2051450447);
   }

   // $FF: renamed from: v (js, js, int) int
   int method_5599(class_310 var1, class_310 var2, int var3) {
      try {
         byte var10000;
         if(1229494071 * var1.field_3744.field_3758 < var2.field_3744.field_3758 * 1229494071) {
            if(var3 <= 2036017633) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if(var1.field_3744.field_3758 * 1229494071 == 1229494071 * var2.field_3744.field_3758) {
            if(var3 <= 2036017633) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "jz.v(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_5599((class_310)var1, (class_310)var2, 2126049073);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "jz.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "jz.equals(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_5600(Object var1, Object var2) {
      return this.method_5599((class_310)var1, (class_310)var2, 2121585914);
   }

   // $FF: renamed from: f (js, js) int
   int method_5601(class_310 var1, class_310 var2) {
      return 1348551191 * var1.field_3744.field_3758 < var2.field_3744.field_3758 * -1781520327?-1:(var1.field_3744.field_3758 * 880981164 == -2009281387 * var2.field_3744.field_3758?0:1);
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_5602(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: v (jv, byte) void
   public static void method_5603(class_306 var0, byte var1) {
      try {
         class_79.field_690 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "jz.v(" + ')');
      }
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_5604(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: <init> () void
   class_315() {
      super();
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_5606(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: n (js, js) int
   int method_5607(class_310 var1, class_310 var2) {
      return 1976315769 * var1.field_3744.field_3758 < var2.field_3744.field_3758 * -1486209325?-1:(var1.field_3744.field_3758 * 1229494071 == 321535859 * var2.field_3744.field_3758?0:1);
   }
}
