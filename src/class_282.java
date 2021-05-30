import java.util.Iterator;

// $FF: renamed from: ik
public class class_282 {

   // $FF: renamed from: f int[]
   public static int[] field_3246;
   // $FF: renamed from: n int[]
   public static int[] field_3247;
   // $FF: renamed from: v int[]
   static int[] field_3248;
   // $FF: renamed from: bd java.lang.String
   static String field_3249;


    // $FF: renamed from: <clinit> () void
   static {
      field_3248 = new int[32];
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field_3248[var1] = var0 - 1;
         var0 += var0;
      }

      field_3247 = new int[4000];
      field_3246 = new int[4000];
   }

    // $FF: renamed from: kt (byte) void
   static final void method_5178(byte var0) {
      try {
         for(int var1 = 0; var1 < class_195.field_2313 * -1143549299; ++var1) {
            if(var0 != -1) {
               throw new IllegalStateException();
            }

            class_100 var2 = client.field_1605[class_195.field_2318[var1]];
            var2.method_1826();
         }

         Iterator var4 = class_197.field_2334.iterator();

         while(var4.hasNext()) {
            if(var0 != -1) {
               throw new IllegalStateException();
            }

            class_101 var5 = (class_101)var4.next();
            var5.method_1907();
         }

         if(class_233.field_2617 != null) {
            if(var0 != -1) {
               throw new IllegalStateException();
            }

            class_233.field_2617.method_6148();
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
