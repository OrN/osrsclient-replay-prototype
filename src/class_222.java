
// $FF: renamed from: fg
public class class_222 {

    // $FF: renamed from: hj oh[]
   static class_67[] field_2518;


    // $FF: renamed from: g (byte) void
   static void method_4275() {
      try {
         class_177.field_2194 = -1648450872;
         class_299.method_5348(class_305.field_3638, class_305.field_3644, class_305.field_3640);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: y (int, int) boolean
   public static boolean method_4276(int var0, int var1) {
      try {
         boolean var10000;
         if((var0 >> 20 & 1) != 0) {
            if(var1 != 1604021821) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

    // $FF: renamed from: jj (int) void
   static void method_4278(int var0) {
      try {
         for(class_48 var1 = (class_48)client.field_1578.method_6531(); null != var1; var1 = (class_48)client.field_1578.method_6527()) {
            if(var0 <= 668516800) {
               throw new IllegalStateException();
            }

            int var2 = 897280301 * var1.field_353;
            if(class_191.method_3957(var2, (byte)-122)) {
               if(var0 <= 668516800) {
                  throw new IllegalStateException();
               }

               boolean var3 = true;
               class_37[] var4 = class_37.field_93[var2];

               int var5;
               for(var5 = 0; var5 < var4.length; ++var5) {
                  if(var0 <= 668516800) {
                     return;
                  }

                  if(null != var4[var5]) {
                     var3 = var4[var5].field_100;
                     break;
                  }
               }

               if(!var3) {
                  if(var0 <= 668516800) {
                     return;
                  }

                  var5 = (int)var1.field_9;
                  class_37 var6 = class_71.method_1047(var5);
                  if(null != var6) {
                     if(var0 <= 668516800) {
                        return;
                     }

                     class_254.method_4900(var6, (byte)16);
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}
