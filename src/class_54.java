
// $FF: renamed from: j
public class class_54 extends class_51 {

   // $FF: renamed from: av int
   static final int field_402 = 41;
   // $FF: renamed from: p int
   public static final int field_403 = 768;
   // $FF: renamed from: aq int
   static final int field_404 = 24;
   // $FF: renamed from: an int
   static int field_405;
   // $FF: renamed from: ez jp
   static class_307 field_406;
   // $FF: renamed from: j int
   public static final int field_407 = 31;
   // $FF: renamed from: v int
   int field_408;
   // $FF: renamed from: bu int
   static final int field_409 = 70;
   // $FF: synthetic field
   final class_180 this$0;


   // $FF: renamed from: ih (int, byte) boolean
   static final boolean method_581(int var0, byte var1) {
      try {
         if(var0 < 0) {
            if(var1 <= 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var2 = client.field_1557[var0];
            if(var2 >= 2000) {
               if(var1 <= 1) {
                  throw new IllegalStateException();
               }

               var2 -= 2000;
            }

            if(1007 == var2) {
               if(var1 <= 1) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (int, short) byte[]
   public static synchronized byte[] method_582(int var0) {
      try {
         return class_319.method_5660(var0, false, (byte)100);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (y, int) void
   void method_569(class_44 var1, int var2) {
      try {
         var1.method_500(-625073017 * this.field_408);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_570(class_28 var1) {
      this.field_408 = var1.method_132() * -1560714953;
      var1.method_130();
      if(var1.method_130() != 255) {
         var1.field_15 -= -1025691571;
         var1.method_136();
      }

   }

   // $FF: renamed from: y (y) void
   void method_568(class_44 var1) {
      var1.method_500(-625073017 * this.field_408);
   }

   // $FF: renamed from: ik (int) void
   static void method_583(int var0) {
      try {
         if(client.field_1572) {
            class_37 var1 = class_325.method_5779(class_148.field_1875 * 1430642749, client.field_1573 * 1683168531, 1430739416);
            if(null != var1) {
               if(var0 == 109611336) {
                  throw new IllegalStateException();
               }

               if(null != var1.field_199) {
                  if(var0 == 109611336) {
                     throw new IllegalStateException();
                  }

                  class_45 var10000 = new class_45();
                  class_45 var2 = var10000;
                  var2.field_332 = var1;
                  var2.field_337 = var1.field_199;
                  class_203.method_4099(var2);
               }
            }

            client.field_1564 = 504803099;
            client.field_1572 = false;
            class_254.method_4900(var1, (byte)54);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> (x) void
   class_54(class_180 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_408 = 1560714953;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: n (int, java.lang.String, java.lang.String, java.lang.String, int) void
   static void method_585(int var0, String var1, String var2, String var3, int var4) {
      try {
         class_175 var5 = (class_175)class_197.field_2338.get(Integer.valueOf(var0));
         if(null == var5) {
            if(var4 <= -1777032700) {
               return;
            }

            class_175 var10000 = new class_175();
            var5 = var10000;
            class_197.field_2338.put(Integer.valueOf(var0), var5);
         }

         class_101 var6 = var5.method_3732(var0, var1, var2, var3, 437343873);
         class_197.field_2334.method_6588(var6, (long)(1017616665 * var6.field_1183));
         class_197.field_2336.method_5797(var6);
         client.field_1611 = -625396947 * client.field_1602;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: y (int, byte) int
   public static int method_586(int var0) {
      try {
         return class_74.method_1129(class_255.field_2883[var0]);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (nd, int) void
   void method_571(class_28 var1, int var2) {
      try {
         this.field_408 = var1.method_132() * -1560714953;
         var1.method_130();
         if(var1.method_130() != 255) {
            if(var2 >= 778749602) {
               throw new IllegalStateException();
            }

            var1.field_15 -= -1025691571;
            var1.method_136();
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}
