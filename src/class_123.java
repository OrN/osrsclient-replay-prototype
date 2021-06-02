
// $FF: renamed from: d
public class class_123 extends class_111 {

   // $FF: renamed from: ed jp
   static IDXFile idx17;
   // $FF: renamed from: n java.lang.String
   String field_1346;
    // $FF: renamed from: dx jp
   static IDXFile idx2;
    // $FF: renamed from: o boolean
   public static boolean field_1350;
    // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: v long
   long field_1352;


   // $FF: renamed from: jp (int) boolean
   static boolean method_2275() {
      try {
         return client.field_1498;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: <init> (f) void
   class_123(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_1352 = -5333157319275296417L;
         this.field_1346 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         if(var1.readUnsignedByte() != 255) {
            var1.offset -= -1025691571;
            this.field_1352 = var1.readLong() * 5333157319275296417L;
         }

         this.field_1346 = var1.method_347(-45515982);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3641(this.field_1352 * 5988895091532737889L, this.field_1346, 0, 965862752);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      if(var1.readUnsignedByte() != 255) {
         var1.offset -= 1960136266;
         this.field_1352 = var1.readLong() * 5333157319275296417L;
      }

      this.field_1346 = var1.method_347(84371846);
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3641(this.field_1352 * 5988895091532737889L, this.field_1346, 0, 965862752);
   }

   // $FF: renamed from: aw (int, cf, boolean, byte) int
   static int method_2277(int var0, byte var3) {
      try {
         if(var0 == 7100) {
            if(var3 >= 7) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 += -1087727229;
               return 1;
            }
         } else if(var0 == 7101) {
            if(var3 >= 7) {
               throw new IllegalStateException();
            } else {
               class_165.field_2054 += -1000716630;
               return 1;
            }
         } else {
            if(var0 != 7102) {
               if(var3 >= 7) {
                  throw new IllegalStateException();
               }

               if(var0 != 7103) {
                  if(var3 >= 7) {
                     throw new IllegalStateException();
                  }

                  if(var0 != 7104) {
                     if(var3 >= 7) {
                        throw new IllegalStateException();
                     }

                     if(7105 != var0) {
                        if(var3 >= 7) {
                           throw new IllegalStateException();
                        }

                        if(var0 != 7109) {
                           if(7106 == var0) {
                              if(var3 >= 7) {
                                 throw new IllegalStateException();
                              }

                              class_136.field_1752 += -1087727229;
                              return 1;
                           }

                           if(var0 == 7107) {
                              class_136.field_1752 += -1087727229;
                              return 1;
                           }

                           if(7108 == var0) {
                              int[] var10000 = class_165.field_2052;
                              int var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                              byte var10002;
                              if(class_220.method_4235()) {
                                 if(var3 >= 7) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = 1;
                              } else {
                                 var10002 = 0;
                              }

                              var10000[var10001] = var10002;
                              return 1;
                           }

                           return 2;
                        }

                        if(var3 >= 7) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }

            class_136.field_1752 += -1087727229;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      if(var1.readUnsignedByte() != 255) {
         var1.offset -= -1025691571;
         this.field_1352 = var1.readLong() * 5333157319275296417L;
      }

      this.field_1346 = var1.method_347(-489116618);
   }
}
