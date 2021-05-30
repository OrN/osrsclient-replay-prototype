
// $FF: renamed from: iq
public class class_36 extends class_27 {

   // $FF: renamed from: x int
   int field_67;
   // $FF: renamed from: n in
   class_38 field_68;
   // $FF: renamed from: p int
   int field_69;
   // $FF: renamed from: y hk
   class_262 field_70;
   // $FF: renamed from: e int
   int field_71;
   // $FF: renamed from: j int
   int field_72;
   // $FF: renamed from: r int
   int field_73;
   // $FF: renamed from: b int
   int field_74;
   // $FF: renamed from: s int
   int field_75;
   // $FF: renamed from: d int
   int field_76;
   // $FF: renamed from: u int
   int field_77;
   // $FF: renamed from: l int
   int field_78;
   // $FF: renamed from: o int
   int field_79;
   // $FF: renamed from: w int
   int field_80;
   // $FF: renamed from: v int
   int field_81;
   // $FF: renamed from: g int
   int field_82;
   // $FF: renamed from: a int
   int field_83;
   // $FF: renamed from: k int
   int field_84;
   // $FF: renamed from: m bv
   class_107 field_85;
   // $FF: renamed from: f au
   class_110 field_86;
   // $FF: renamed from: c int
   int field_87;


   // $FF: renamed from: <init> () void
   class_36() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "iq.<init>(" + ')');
      }
   }

   // $FF: renamed from: v (byte) void
   void method_394(byte var1) {
      try {
         this.field_68 = null;
         this.field_86 = null;
         this.field_70 = null;
         this.field_85 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "iq.v(" + ')');
      }
   }

   // $FF: renamed from: n () void
   void method_395() {
      this.field_68 = null;
      this.field_86 = null;
      this.field_70 = null;
      this.field_85 = null;
   }

   // $FF: renamed from: f () void
   void method_396() {
      this.field_68 = null;
      this.field_86 = null;
      this.field_70 = null;
      this.field_85 = null;
   }

   // $FF: renamed from: y () void
   void method_397() {
      this.field_68 = null;
      this.field_86 = null;
      this.field_70 = null;
      this.field_85 = null;
   }

   // $FF: renamed from: f (java.lang.CharSequence, int, boolean, int) boolean
   static boolean method_398(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if(var1 >= 2) {
            if(var3 != -387650050) {
               throw new IllegalStateException();
            }

            if(var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();
               int var8 = 0;

               while(true) {
                  if(var8 >= var7) {
                     return var5;
                  }

                  if(var3 != -387650050) {
                     throw new IllegalStateException();
                  }

                  label138: {
                     char var9 = var0.charAt(var8);
                     if(0 == var8) {
                        if(var3 != -387650050) {
                           throw new IllegalStateException();
                        }

                        if(45 == var9) {
                           if(var3 != -387650050) {
                              throw new IllegalStateException();
                           }

                           var4 = true;
                           break label138;
                        }

                        if(43 == var9) {
                           if(var3 != -387650050) {
                              throw new IllegalStateException();
                           }

                           if(var2) {
                              if(var3 != -387650050) {
                                 throw new IllegalStateException();
                              }
                              break label138;
                           }
                        }
                     }

                     int var12;
                     label140: {
                        if(var9 >= 48) {
                           if(var3 != -387650050) {
                              throw new IllegalStateException();
                           }

                           if(var9 <= 57) {
                              if(var3 != -387650050) {
                                 throw new IllegalStateException();
                              }

                              var12 = var9 - 48;
                              break label140;
                           }
                        }

                        if(var9 >= 65) {
                           if(var3 != -387650050) {
                              throw new IllegalStateException();
                           }

                           if(var9 <= 90) {
                              if(var3 != -387650050) {
                                 throw new IllegalStateException();
                              }

                              var12 = var9 - 55;
                              break label140;
                           }
                        }

                        if(var9 < 97) {
                           break;
                        }

                        if(var3 != -387650050) {
                           throw new IllegalStateException();
                        }

                        if(var9 > 122) {
                           break;
                        }

                        var12 = var9 - 87;
                     }

                     if(var12 >= var1) {
                        return false;
                     }

                     if(var4) {
                        if(var3 != -387650050) {
                           throw new IllegalStateException();
                        }

                        var12 = -var12;
                     }

                     int var10 = var12 + var6 * var1;
                     if(var6 != var10 / var1) {
                        if(var3 != -387650050) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     var6 = var10;
                     var5 = true;
                  }

                  ++var8;
               }

               return false;
            }

            if(var3 != -387650050) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "iq.f(" + ')');
      }
   }
}
