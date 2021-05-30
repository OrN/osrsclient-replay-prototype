import java.util.Comparator;

// $FF: renamed from: jz
final class class_315 implements Comparator {


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
         throw class_223.method_4281(var4);
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_5599((class_310)var1, (class_310)var2, 2126049073);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: v (jv, byte) void
   public static void method_5603(class_306 var0) {
      try {
         class_79.field_690 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: <init> () void
   class_315() {
      super();
   }

}
