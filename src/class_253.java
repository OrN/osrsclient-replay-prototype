
// $FF: renamed from: gv
public final class class_253 {

   // $FF: renamed from: b int
   int field_2860;
   // $FF: renamed from: n int
   int field_2861;
   // $FF: renamed from: f int
   int field_2862;
   // $FF: renamed from: y gl
   class_91 field_2863;
   // $FF: renamed from: p gl
   class_91 field_2864;
   // $FF: renamed from: j gl
   class_91 field_2865;
   // $FF: renamed from: r long
   long field_2866;
   // $FF: renamed from: v int
   int field_2867;


   // $FF: renamed from: <init> () void
   class_253() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: y (byte[], int) void
   public static synchronized void method_4898(byte[] var0, int var1) {
      try {
         if(100 == var0.length) {
            if(var1 >= 1259193368) {
               throw new IllegalStateException();
            }

            if(class_319.field_3799 * -1219327977 < 1000) {
               class_319.field_3796[(class_319.field_3799 += 1851469735) * -1219327977 - 1] = var0;
               return;
            }
         }

         if(5000 == var0.length && -1748405633 * class_319.field_3794 < 250) {
            if(var1 >= 1259193368) {
               throw new IllegalStateException();
            } else {
               class_319.field_3797[(class_319.field_3794 += -731886209) * -1748405633 - 1] = var0;
            }
         } else {
            if(30000 == var0.length) {
               if(var1 >= 1259193368) {
                  throw new IllegalStateException();
               }

               if(class_319.field_3795 * 434807287 < 50) {
                  if(var1 >= 1259193368) {
                     return;
                  }

                  class_319.field_3798[(class_319.field_3795 += 472805319) * 434807287 - 1] = var0;
                  return;
               }
            }

            if(class_52.field_390 != null) {
               if(var1 >= 1259193368) {
                  throw new IllegalStateException();
               }

               for(int var2 = 0; var2 < class_319.field_3793.length; ++var2) {
                  if(var1 >= 1259193368) {
                     throw new IllegalStateException();
                  }

                  if(var0.length == class_319.field_3793[var2]) {
                     if(var1 >= 1259193368) {
                        throw new IllegalStateException();
                     }

                     if(class_319.field_3800[var2] < class_52.field_390[var2].length) {
                        if(var1 >= 1259193368) {
                           throw new IllegalStateException();
                        }

                        class_52.field_390[var2][class_319.field_3800[var2]++] = var0;
                        return;
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: c (byte[], byte) void
   public static void method_4899(byte[] var0, byte var1) {
      try {
         Buffer var10000 = new Buffer(var0);
         Buffer var2 = var10000;
         var2.offset = (var0.length - 2) * -1025691571;
         class_403.field_4277 = var2.readShort() * -2047545261;
         class_223.field_2529 = new int[-522791973 * class_403.field_4277];
         class_284.field_3260 = new int[class_403.field_4277 * -522791973];
         class_403.field_4278 = new int[class_403.field_4277 * -522791973];
         class_318.field_3787 = new int[-522791973 * class_403.field_4277];
         class_403.field_4279 = new byte[class_403.field_4277 * -522791973][];
         var2.offset = -1025691571 * (var0.length - 7 - 112631512 * class_403.field_4277);
         class_403.field_4276 = var2.readShort() * 1394733573;
         class_380.field_4201 = var2.readShort() * -410368705;
         int var3 = (var2.readUnsignedByte() & 255) + 1;

         int var4;
         for(var4 = 0; var4 < class_403.field_4277 * -522791973; ++var4) {
            if(var1 != 1) {
               throw new IllegalStateException();
            }

            class_223.field_2529[var4] = var2.readShort();
         }

         for(var4 = 0; var4 < class_403.field_4277 * -522791973; ++var4) {
            if(var1 != 1) {
               throw new IllegalStateException();
            }

            class_284.field_3260[var4] = var2.readShort();
         }

         for(var4 = 0; var4 < class_403.field_4277 * -522791973; ++var4) {
            class_403.field_4278[var4] = var2.readShort();
         }

         for(var4 = 0; var4 < -522791973 * class_403.field_4277; ++var4) {
            if(var1 != 1) {
               throw new IllegalStateException();
            }

            class_318.field_3787[var4] = var2.readShort();
         }

         var2.offset = -1025691571 * (var0.length - 7 - class_403.field_4277 * 112631512 - (var3 - 1) * 3);
         class_192.field_2300 = new int[var3];

         for(var4 = 1; var4 < var3; ++var4) {
            if(var1 != 1) {
               throw new IllegalStateException();
            }

            class_192.field_2300[var4] = var2.method_134();
            if(class_192.field_2300[var4] == 0) {
               if(var1 != 1) {
                  throw new IllegalStateException();
               }

               class_192.field_2300[var4] = 1;
            }
         }

         var2.offset = 0;

         for(var4 = 0; var4 < class_403.field_4277 * -522791973; ++var4) {
            if(var1 != 1) {
               throw new IllegalStateException();
            }

            int var5 = class_403.field_4278[var4];
            int var6 = class_318.field_3787[var4];
            int var7 = var5 * var6;
            byte[] var8 = new byte[var7];
            class_403.field_4279[var4] = var8;
            int var9 = var2.readUnsignedByte();
            int var10;
            if(var9 == 0) {
               if(var1 != 1) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < var7; ++var10) {
                  if(var1 != 1) {
                     return;
                  }

                  var8[var10] = var2.readByte();
               }
            } else if(1 == var9) {
               if(var1 != 1) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < var5; ++var10) {
                  if(var1 != 1) {
                     throw new IllegalStateException();
                  }

                  for(int var11 = 0; var11 < var6; ++var11) {
                     if(var1 != 1) {
                        throw new IllegalStateException();
                     }

                     var8[var5 * var11 + var10] = var2.readByte();
                  }
               }
            }
         }

      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }
}
