
// $FF: renamed from: ez
public abstract class class_191 {

   // $FF: renamed from: tg short[]
   static short[] field_2289;
   // $FF: renamed from: r int
   static final int field_2290 = 4095;
   // $FF: renamed from: cf int
   static final int field_2291 = 18;


   // $FF: renamed from: <init> () void
   void method_3949() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ez.<init>(" + ')');
      }
   }

   // $FF: renamed from: v (int) void
   public abstract void method_3950(int var1);

   // $FF: renamed from: n (int, int, int) int
   public abstract int method_3951(int var1, int var2, int var3);

   // $FF: renamed from: y () void
   public abstract void method_3952();

   // $FF: renamed from: f (int, int) int
   public abstract int method_3953(int var1, int var2);

   // $FF: renamed from: p () void
   public abstract void method_3954();

   // $FF: renamed from: j () void
   public abstract void method_3955();

   // $FF: renamed from: jd (io, int, int, boolean, int) void
   static void method_3956(class_37 var0, int var1, int var2, boolean var3, int var4) {
      try {
         int var5 = 1163271639 * var0.field_104;
         int var6 = var0.field_117 * -571887853;
         if(0 == var0.field_108 * 718963747) {
            if(var4 >= -1588606291) {
               throw new IllegalStateException();
            }

            var0.field_104 = var0.field_112 * -1062967355;
         } else if(1 == var0.field_108 * 718963747) {
            if(var4 >= -1588606291) {
               return;
            }

            var0.field_104 = (var1 - 1593997171 * var0.field_112) * -1921178137;
         } else if(var0.field_108 * 718963747 == 2) {
            if(var4 >= -1588606291) {
               throw new IllegalStateException();
            }

            var0.field_104 = (var1 * var0.field_112 * 1593997171 >> 14) * -1921178137;
         }

         if(var0.field_109 * -685885519 == 0) {
            if(var4 >= -1588606291) {
               throw new IllegalStateException();
            }

            var0.field_117 = var0.field_113 * -361138141;
         } else if(-685885519 * var0.field_109 == 1) {
            var0.field_117 = (var2 - var0.field_113 * -16853095) * 202863387;
         } else if(-685885519 * var0.field_109 == 2) {
            if(var4 >= -1588606291) {
               return;
            }

            var0.field_117 = 202863387 * (var2 * var0.field_113 * -16853095 >> 14);
         }

         if(718963747 * var0.field_108 == 4) {
            var0.field_104 = -1702141443 * var0.field_203 * -571887853 * var0.field_117 / (90095899 * var0.field_119) * -1921178137;
         }

         if(-685885519 * var0.field_109 == 4) {
            var0.field_117 = 202863387 * (var0.field_104 * 1163271639 * 90095899 * var0.field_119 / (-1702141443 * var0.field_203));
         }

         if(-1245218361 * var0.field_207 == 1337) {
            if(var4 >= -1588606291) {
               return;
            }

            client.field_1614 = var0;
         }

         if(var3) {
            if(var4 >= -1588606291) {
               return;
            }

            if(var0.field_218 != null) {
               if(var5 == 1163271639 * var0.field_104) {
                  if(var4 >= -1588606291) {
                     throw new IllegalStateException();
                  }

                  if(var6 == var0.field_117 * -571887853) {
                     return;
                  }

                  if(var4 >= -1588606291) {
                     throw new IllegalStateException();
                  }
               }

               class_45 var10000 = new class_45;
               var10000.method_105();
               class_45 var7 = var10000;
               var7.field_332 = var0;
               var7.field_337 = var0.field_218;
               client.field_1576.method_5939(var7);
            }
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "ez.jd(" + ')');
      }
   }

   // $FF: renamed from: f (int, byte) boolean
   public static boolean method_3957(int var0, byte var1) {
      try {
         if(class_37.field_94[var0]) {
            if(var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if(!class_46.field_343.method_5411(var0, (byte)102)) {
            return false;
         } else {
            int var2 = class_46.field_343.method_5393(var0, 1291246750);
            if(0 == var2) {
               class_37.field_94[var0] = true;
               return true;
            } else {
               if(null == class_37.field_93[var0]) {
                  if(var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  class_37.field_93[var0] = new class_37[var2];
               }

               for(int var3 = 0; var3 < var2; ++var3) {
                  if(var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if(null == class_37.field_93[var0][var3]) {
                     if(var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     byte[] var4 = class_46.field_343.method_5381(var0, var3, -26460885);
                     if(var4 != null) {
                        if(var1 >= 0) {
                           throw new IllegalStateException();
                        }

                        class_37[] var10000 = class_37.field_93[var0];
                        class_37 var10002 = new class_37;
                        var10002.method_105();
                        var10000[var3] = var10002;
                        class_37.field_93[var0][var3].field_101 = 1969535585 * ((var0 << 16) + var3);
                        class_28 var10001;
                        class_37 var6;
                        if(var4[0] == -1) {
                           var6 = class_37.field_93[var0][var3];
                           var10001 = new class_28;
                           var10001.method_178(var4);
                           var6.method_401(var10001, 107425419);
                        } else {
                           var6 = class_37.field_93[var0][var3];
                           var10001 = new class_28;
                           var10001.method_178(var4);
                           var6.method_400(var10001, 1748856001);
                        }
                     }
                  }
               }

               class_37.field_94[var0] = true;
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ez.f(" + ')');
      }
   }
}
