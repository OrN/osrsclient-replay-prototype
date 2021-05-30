import java.util.Comparator;

// $FF: renamed from: jc
final class class_294 implements Comparator {

   // $FF: renamed from: x int
   static final int field_3341 = 22;


   // $FF: renamed from: <init> () void
   class_294() {
      super();
   }

   // $FF: renamed from: v (js, js, int) int
   int method_5306(class_310 var1, class_310 var2) {
      try {
         return var1.method_5537().compareTo(var2.method_5537());
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_5307(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: f (js, js) int
   int method_5308(class_310 var1, class_310 var2) {
      return var1.method_5537().compareTo(var2.method_5537());
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_5309(Object var1, Object var2) {
      return this.method_5306((class_310)var1, (class_310)var2);
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_5310(Object var1, Object var2) {
      return this.method_5306((class_310)var1, (class_310)var2);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_5306((class_310)var1, (class_310)var2);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_5311(Object var1) {
      return super.equals(var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (js, js) int
   int method_5312(class_310 var1, class_310 var2) {
      return var1.method_5537().compareTo(var2.method_5537());
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_5313(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: fu (int, int, int) void
   static void method_5314(int var0, int var2) {
      try {
         if(1285356667 * class_87.preferences.field_2122 != 0) {
            if(var2 >= 2078964271) {
               return;
            }

            if(var0 != -1) {
               if(var2 >= 2078964271) {
                  throw new IllegalStateException();
               }

               class_162.method_3399(class_221.field_2516, var0, 0, class_87.preferences.field_2122 * 1285356667, false);
               client.field_1657 = true;
            }
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
