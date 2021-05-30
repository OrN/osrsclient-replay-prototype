
// $FF: renamed from: dy
public class class_182 extends class_181 {

    // $FF: renamed from: v boolean
   final boolean field_2246;


    public int compare(Object var1, Object var2) {
      try {
         return this.method_3831((class_339)var1, (class_339)var2, -1643284848);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (lv, lv, int) int
   int method_3831(class_339 var1, class_339 var2, int var3) {
      try {
         byte var10000;
         if(client.field_1413 * 1396273817 == var1.field_3888 * 1693720149) {
            if(var3 >= -1513521924) {
               throw new IllegalStateException();
            }

            if(var2.field_3888 * 1693720149 != 1396273817 * client.field_1413) {
               if(var3 >= -1513521924) {
                  throw new IllegalStateException();
               }

               if(this.field_2246) {
                  if(var3 >= -1513521924) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if(1396273817 * client.field_1413 == var2.field_3888 * 1693720149) {
            if(var3 >= -1513521924) {
               throw new IllegalStateException();
            }

            if(this.field_2246) {
               if(var3 >= -1513521924) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = -1;
            }

            return var10000;
         }

         return this.method_3830(var1, var2);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

    // $FF: renamed from: <init> (boolean) void
   public class_182(boolean var1) {
      super();
      try {
         this.field_2246 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: n (long) boolean
   static boolean method_3836(long var0) {
      try {
         int var2 = (int)(var0 >>> 14 & 3L);
         return var2 == 2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

}
