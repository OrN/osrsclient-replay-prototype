
// $FF: renamed from: dd
public class class_188 extends class_181 {

   // $FF: renamed from: v boolean
   final boolean field_2271;


    // $FF: renamed from: <init> (boolean) void
   public class_188(boolean var1) {
      super();
      try {
         this.field_2271 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (lv, lv, int) int
   int method_3888(class_339 var1, class_339 var2, int var3) {
      try {
         if(1693720149 * var1.field_3888 != 0) {
            if(var3 <= -1900818268) {
               throw new IllegalStateException();
            }

            if(1693720149 * var2.field_3888 != 0) {
               if(var3 <= -1900818268) {
                  throw new IllegalStateException();
               }

               return this.field_2271?-1023710905 * var1.field_3885 - -1023710905 * var2.field_3885:var2.field_3885 * -1023710905 - -1023710905 * var1.field_3885;
            }
         }

         return this.method_3830(var1, var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    public int compare(Object var1, Object var2) {
      try {
         return this.method_3888((class_339)var1, (class_339)var2, -1880914380);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

}
