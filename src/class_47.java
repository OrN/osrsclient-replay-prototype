
// $FF: renamed from: cw
public class class_47 extends class_27 {

   // $FF: renamed from: al int
   static final int field_349 = 4;
   // $FF: renamed from: f et
   class_77 field_350;
   // $FF: renamed from: y ki
   class_323 field_351;
   // $FF: renamed from: v int
   static final int field_352 = 4;


   // $FF: renamed from: b (int) cx
   class_46 method_538(int var1) {
      class_46 var2 = (class_46)this.field_351.method_5700();
      if(var2 != null && -859723449 * var2.field_344 <= var1) {
         for(class_46 var3 = (class_46)this.field_351.method_5702(); null != var3 && var3.field_344 * -859723449 <= var1; var3 = (class_46)this.field_351.method_5702()) {
            var2.method_108();
            var2 = var3;
         }

         if(181606605 * this.field_350.field_665 + var2.field_344 * -859723449 + 687360175 * var2.field_346 > var1) {
            return var2;
         } else {
            var2.method_108();
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: v (int, int, int, int, int) void
   void method_539(int var1, int var2, int var3, int var4, int var5) {
      try {
         class_46 var6 = null;
         int var7 = 0;

         for(class_46 var8 = (class_46)this.field_351.method_5700(); var8 != null; var8 = (class_46)this.field_351.method_5702()) {
            if(var5 >= 1031741011) {
               throw new IllegalStateException();
            }

            ++var7;
            if(var1 == -859723449 * var8.field_344) {
               if(var5 >= 1031741011) {
                  throw new IllegalStateException();
               }

               var8.method_533(var1, var2, var3, var4);
               return;
            }

            if(-859723449 * var8.field_344 <= var1) {
               var6 = var8;
            }
         }

         if(var6 == null) {
            if(var5 >= 1031741011) {
               throw new IllegalStateException();
            } else {
               if(var7 < 4) {
                  class_323 var10 = this.field_351;
                  class_46 var10001 = new class_46(var1, var2, var3, var4);
                  var10.method_5698(var10001);
               }

            }
         } else {
            class_46 var10000 = new class_46(var1, var2, var3, var4);
            class_323.method_5743(var10000, var6);
            if(var7 >= 4) {
               if(var5 >= 1031741011) {
                  throw new IllegalStateException();
               }

               this.field_351.method_5700().method_108();
            }

         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: n (int, byte) cx
   class_46 method_540(int var1, byte var2) {
      try {
         class_46 var3 = (class_46)this.field_351.method_5700();
         if(var3 != null) {
            if(var2 == 1) {
               throw new IllegalStateException();
            }

            if(-859723449 * var3.field_344 <= var1) {
               for(class_46 var4 = (class_46)this.field_351.method_5702(); null != var4; var4 = (class_46)this.field_351.method_5702()) {
                  if(var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if(var4.field_344 * -859723449 > var1) {
                     break;
                  }

                  var3.method_108();
                  var3 = var4;
               }

               if(181606605 * this.field_350.field_665 + var3.field_344 * -859723449 + 687360175 * var3.field_346 > var1) {
                  if(var2 == 1) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }

               var3.method_108();
               return null;
            }

            if(var2 == 1) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: f (int) boolean
   boolean method_541() {
      try {
         return this.field_351.method_5704();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <init> (et) void
   class_47(class_77 var1) {
      try {
         class_323 var10001 = new class_323();
         this.field_351 = var10001;
         this.field_350 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (int, int, int, int) void
   void method_543(int var1, int var2, int var3, int var4) {
      class_46 var5 = null;
      int var6 = 0;

      for(class_46 var7 = (class_46)this.field_351.method_5700(); var7 != null; var7 = (class_46)this.field_351.method_5702()) {
         ++var6;
         if(var1 == -1296042187 * var7.field_344) {
            var7.method_533(var1, var2, var3, var4);
            return;
         }

         if(-859723449 * var7.field_344 <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            class_323 var8 = this.field_351;
            class_46 var10001 = new class_46(var1, var2, var3, var4);
            var8.method_5698(var10001);
         }

      } else {
         class_46 var10000 = new class_46(var1, var2, var3, var4);
         class_323.method_5743(var10000, var5);
         if(var6 >= 4) {
            this.field_351.method_5700().method_108();
         }

      }
   }

   // $FF: renamed from: p (int, int, int, int) void
   void method_544(int var1, int var2, int var3, int var4) {
      class_46 var5 = null;
      int var6 = 0;

      for(class_46 var7 = (class_46)this.field_351.method_5700(); var7 != null; var7 = (class_46)this.field_351.method_5702()) {
         ++var6;
         if(var1 == -859723449 * var7.field_344) {
            var7.method_533(var1, var2, var3, var4);
            return;
         }

         if(-859723449 * var7.field_344 <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            class_323 var8 = this.field_351;
            class_46 var10001 = new class_46(var1, var2, var3, var4);
            var8.method_5698(var10001);
         }

      } else {
         class_46 var10000 = new class_46(var1, var2, var3, var4);
         class_323.method_5743(var10000, var5);
         if(var6 >= 4) {
            this.field_351.method_5700().method_108();
         }

      }
   }

   // $FF: renamed from: r (int) cx
   class_46 method_545(int var1) {
      class_46 var2 = (class_46)this.field_351.method_5700();
      if(var2 != null && -859723449 * var2.field_344 <= var1) {
         for(class_46 var3 = (class_46)this.field_351.method_5702(); null != var3 && var3.field_344 * -859723449 <= var1; var3 = (class_46)this.field_351.method_5702()) {
            var2.method_108();
            var2 = var3;
         }

         if(181606605 * this.field_350.field_665 + var2.field_344 * -859723449 + 687360175 * var2.field_346 > var1) {
            return var2;
         } else {
            var2.method_108();
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: j (int, int, int, int) void
   void method_546(int var1, int var2, int var3, int var4) {
      class_46 var5 = null;
      int var6 = 0;

      for(class_46 var7 = (class_46)this.field_351.method_5700(); var7 != null; var7 = (class_46)this.field_351.method_5702()) {
         ++var6;
         if(var1 == -859723449 * var7.field_344) {
            var7.method_533(var1, var2, var3, var4);
            return;
         }

         if(398081597 * var7.field_344 <= var1) {
            var5 = var7;
         }
      }

      if(var5 == null) {
         if(var6 < 4) {
            class_323 var8 = this.field_351;
            class_46 var10001 = new class_46(var1, var2, var3, var4);
            var8.method_5698(var10001);
         }

      } else {
         class_46 var10000 = new class_46(var1, var2, var3, var4);
         class_323.method_5743(var10000, var5);
         if(var6 >= 4) {
            this.field_351.method_5700().method_108();
         }

      }
   }

   // $FF: renamed from: d () boolean
   boolean method_547() {
      return this.field_351.method_5704();
   }

   // $FF: renamed from: s () boolean
   boolean method_548() {
      return this.field_351.method_5704();
   }
}
