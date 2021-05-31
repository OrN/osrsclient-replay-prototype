
// $FF: renamed from: ji
public class class_299 {

   // $FF: renamed from: b int
   protected static int field_3366;
   // $FF: renamed from: n int
   public static final int field_3367 = 128;
   // $FF: renamed from: f int
   public static final int field_3368 = 64;
   // $FF: renamed from: p op
   static class_66 loginBackground;
   // $FF: renamed from: he int
   static final int field_3370 = 512;
   // $FF: renamed from: v int
   static final int field_3371 = 7;


   // $FF: renamed from: <clinit> () void
   static {
      Math.sqrt(8192.0D);
   }

   // $FF: renamed from: <init> () void
   class_299() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: v (int, int) eq
   public static class_80 method_5347(int var0, int var1) {
      try {
         class_80 var2 = (class_80)class_80.field_702.method_5065((long)var0);
         if(var2 != null) {
            if(var1 >= 708619469) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_368.field_4096.method_5381(10, var0);
            class_80 var10000 = new class_80();
            var2 = var10000;
            var2.field_748 = -31876329 * var0;
            if(var3 != null) {
               if(var1 >= 708619469) {
                  throw new IllegalStateException();
               }

               Buffer var10001 = new Buffer(var3);
               var2.method_1260(var10001, 2116753290);
            }

            var2.method_1259();
            if(-1 != 168192755 * var2.field_743) {
               if(var1 >= 708619469) {
                  throw new IllegalStateException();
               }

               var2.method_1262(method_5347(var2.field_743 * 168192755, -1769840830), method_5347(1027633359 * var2.field_698, -793497659));
            }

            if(-1893254845 * var2.field_749 != -1) {
               if(var1 >= 708619469) {
                  throw new IllegalStateException();
               }

               var2.method_1263(method_5347(var2.field_749 * -1893254845, -1302739324), method_5347(var2.field_734 * -1249308017, 450222671), 2093027907);
            }

            if(var2.field_751 * 1689317723 != -1) {
               var2.method_1301(method_5347(var2.field_751 * 1689317723, -1815715576), method_5347(var2.field_750 * 1563500305, -349401918));
            }

            if(!class_49.field_363) {
               if(var1 >= 708619469) {
                  throw new IllegalStateException();
               }

               if(var2.field_720) {
                  if(var1 >= 708619469) {
                     throw new IllegalStateException();
                  }

                  var2.field_707 = class_305.strMembersObject;
                  var2.field_747 = false;
                  var2.field_721 = null;
                  var2.field_730 = null;
                  var2.field_723 = -1541643739;
                  var2.field_738 = 0;
                  if(null != var2.field_746) {
                     boolean var4 = false;

                     for(class_27 var5 = var2.field_746.method_6584(); null != var5; var5 = var2.field_746.method_6585()) {
                        if(var1 >= 708619469) {
                           throw new IllegalStateException();
                        }

                        class_86 var6 = class_190.method_3948((int)var5.field_9, -884874334);
                        if(var6.field_800) {
                           if(var1 >= 708619469) {
                              throw new IllegalStateException();
                           }

                           var5.method_108();
                        } else {
                           var4 = true;
                        }
                     }

                     if(!var4) {
                        var2.field_746 = null;
                     }
                  }
               }
            }

            class_80.field_702.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: u (java.lang.String, java.lang.String, java.lang.String, byte) void
   static void method_5348(String var0, String var1, String var2) {
      try {
         class_177.field_2196 = var0;
         class_177.field_2197 = var1;
         class_177.field_2213 = var2;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
