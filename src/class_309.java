import java.util.Comparator;

// $FF: renamed from: jr
final class class_309 implements Comparator {

    // $FF: renamed from: ef int
   static int field_3741;


    // $FF: renamed from: v (js, js, int) int
   int method_5527(class_310 var1, class_310 var2, int var3) {
      try {
         byte var10000;
         if(-822093809 * var1.field_3744.field_3756 < var2.field_3744.field_3756 * -822093809) {
            if(var3 <= -470211913) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if(var1.field_3744.field_3756 * -822093809 == -822093809 * var2.field_3744.field_3756) {
            if(var3 <= -470211913) {
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

   // $FF: renamed from: <init> () void
   class_309() {
      super();
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_5527((class_310)var1, (class_310)var2, 1946951772);
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

}
