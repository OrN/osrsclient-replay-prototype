
// $FF: renamed from: ew
public class class_75 extends class_59 {

   // $FF: renamed from: y hz
   public static class_272 field_598;
   // $FF: renamed from: s int
   public int field_599;
   // $FF: renamed from: u int
   static final int field_600 = 0;
   // $FF: renamed from: r int
   int field_601;
   // $FF: renamed from: j int
   public int field_602;
   // $FF: renamed from: w em
   public class_212 field_603;
   // $FF: renamed from: b java.lang.String
   public String field_604;
   // $FF: renamed from: d int
   public int field_605;
   // $FF: renamed from: f jv
   public static class_306 field_606;
   // $FF: renamed from: p int
   public final int field_607;
   // $FF: renamed from: l boolean
   public boolean field_608;
   // $FF: renamed from: o boolean
   public boolean field_609;
   // $FF: renamed from: c java.lang.String[]
   public String[] field_610;
   // $FF: renamed from: e java.lang.String
   public String field_611;
   // $FF: renamed from: g int[]
   int[] field_612;
   // $FF: renamed from: a int
   int field_613;
   // $FF: renamed from: n ew[]
   static class_75[] field_614;
   // $FF: renamed from: m int
   int field_615;
   // $FF: renamed from: x int
   int field_616;
   // $FF: renamed from: z en
   public class_213 field_617;
   // $FF: renamed from: v jv
   static class_306 field_618;
   // $FF: renamed from: t int[]
   int[] field_619;
   // $FF: renamed from: h byte[]
   byte[] field_620;
   // $FF: renamed from: q int
   public int field_621;
   // $FF: renamed from: k int
   int field_622;
   // $FF: renamed from: an int
   static final int field_623 = 58;


   // $FF: renamed from: d (char, short) boolean
   public static boolean method_1130(char var0, short var1) {
      try {
         boolean var10000;
         label41: {
            if(var0 >= 65) {
               if(var1 == 128) {
                  throw new IllegalStateException();
               }

               if(var0 <= 90) {
                  break label41;
               }

               if(var1 == 128) {
                  throw new IllegalStateException();
               }
            }

            if(var0 < 97 || var0 > 122) {
               var10000 = false;
               return var10000;
            }

            if(var1 == 128) {
               throw new IllegalStateException();
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: c (nd) void
   void method_1131(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1132(var1, var2, -1690597462);
      }
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1132(class_28 var1, int var2, int var3) {
      try {
         if(1 == var2) {
            if(var3 >= -509177523) {
               throw new IllegalStateException();
            }

            this.field_602 = var1.method_147(111035027) * 802165351;
         } else if(2 == var2) {
            if(var3 >= -509177523) {
               return;
            }

            this.field_601 = var1.method_147(1344158126) * -1235557667;
         } else if(3 == var2) {
            if(var3 >= -509177523) {
               throw new IllegalStateException();
            }

            this.field_604 = var1.method_139(-391631059);
         } else if(4 == var2) {
            if(var3 >= -509177523) {
               throw new IllegalStateException();
            }

            this.field_605 = var1.method_134() * 1712869385;
         } else if(5 == var2) {
            if(var3 >= -509177523) {
               return;
            }

            var1.method_134();
         } else if(6 == var2) {
            if(var3 >= -509177523) {
               throw new IllegalStateException();
            }

            this.field_599 = var1.method_130() * -1615731849;
         } else {
            int var4;
            if(var2 == 7) {
               if(var3 >= -509177523) {
                  return;
               }

               var4 = var1.method_130();
               if((var4 & 1) == 0) {
                  if(var3 >= -509177523) {
                     return;
                  }

                  this.field_608 = false;
               }

               if(2 == (var4 & 2)) {
                  if(var3 >= -509177523) {
                     return;
                  }

                  this.field_609 = true;
               }
            } else if(8 == var2) {
               var1.method_130();
            } else {
               if(var2 >= 10) {
                  if(var3 >= -509177523) {
                     throw new IllegalStateException();
                  }

                  if(var2 <= 14) {
                     if(var3 >= -509177523) {
                        throw new IllegalStateException();
                     }

                     this.field_610[var2 - 10] = var1.method_139(-391631059);
                     return;
                  }
               }

               if(var2 == 15) {
                  var4 = var1.method_130();
                  this.field_612 = new int[2 * var4];

                  int var5;
                  for(var5 = 0; var5 < var4 * 2; ++var5) {
                     if(var3 >= -509177523) {
                        return;
                     }

                     this.field_612[var5] = var1.method_269(-1542485131);
                  }

                  var1.method_135();
                  var5 = var1.method_130();
                  this.field_619 = new int[var5];

                  int var6;
                  for(var6 = 0; var6 < this.field_619.length; ++var6) {
                     if(var3 >= -509177523) {
                        throw new IllegalStateException();
                     }

                     this.field_619[var6] = var1.method_135();
                  }

                  this.field_620 = new byte[var4];

                  for(var6 = 0; var6 < var4; ++var6) {
                     if(var3 >= -509177523) {
                        throw new IllegalStateException();
                     }

                     this.field_620[var6] = var1.method_131();
                  }
               } else if(16 == var2) {
                  if(var3 >= -509177523) {
                     throw new IllegalStateException();
                  }
               } else if(17 == var2) {
                  this.field_611 = var1.method_139(-391631059);
               } else if(var2 == 18) {
                  if(var3 >= -509177523) {
                     return;
                  }

                  var1.method_147(1203092174);
               } else if(var2 == 19) {
                  if(var3 >= -509177523) {
                     throw new IllegalStateException();
                  }

                  this.field_621 = var1.method_132() * 909096585;
               } else if(var2 == 21) {
                  var1.method_135();
               } else if(var2 == 22) {
                  var1.method_135();
               } else if(var2 == 23) {
                  var1.method_130();
                  var1.method_130();
                  var1.method_130();
               } else if(var2 == 24) {
                  var1.method_269(-1542485131);
                  var1.method_269(-1542485131);
               } else if(25 == var2) {
                  if(var3 >= -509177523) {
                     return;
                  }

                  var1.method_147(714057698);
               } else if(var2 == 28) {
                  if(var3 >= -509177523) {
                     throw new IllegalStateException();
                  }

                  var1.method_130();
               } else if(29 == var2) {
                  if(var3 >= -509177523) {
                     throw new IllegalStateException();
                  }

                  this.field_617 = (class_213)class_197.method_4016(class_82.method_1374(), var1.method_130(), -611336247);
               } else if(var2 == 30) {
                  if(var3 >= -509177523) {
                     return;
                  }

                  this.field_603 = (class_212)class_197.method_4016(class_163.method_3418(), var1.method_130(), -611336247);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: p (int) void
   void method_1133(int var1) {
      try {
         if(this.field_612 != null) {
            if(var1 == -1862424887) {
               throw new IllegalStateException();
            }

            for(int var2 = 0; var2 < this.field_612.length; var2 += 2) {
               if(var1 == -1862424887) {
                  throw new IllegalStateException();
               }

               if(this.field_612[var2] < 61627465 * this.field_613) {
                  this.field_613 = -1056549383 * this.field_612[var2];
               } else if(this.field_612[var2] > 1059928721 * this.field_615) {
                  if(var1 == -1862424887) {
                     return;
                  }

                  this.field_615 = this.field_612[var2] * 309184113;
               }

               if(this.field_612[var2 + 1] < -1855572569 * this.field_622) {
                  if(var1 == -1862424887) {
                     throw new IllegalStateException();
                  }

                  this.field_622 = this.field_612[var2 + 1] * -706272745;
               } else if(this.field_612[var2 + 1] > this.field_616 * 1980828279) {
                  this.field_616 = -87560377 * this.field_612[var2 + 1];
               }
            }
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: j (boolean, int) oh
   public class_67 method_1134(boolean var1, int var2) {
      try {
         int var10000;
         if(var1) {
            if(var2 != -2060838679) {
               throw new IllegalStateException();
            }

            var10000 = 1973945717 * this.field_601;
         } else {
            var10000 = 300345687 * this.field_602;
         }

         int var3 = var10000;
         return this.method_1151(var3, 2134541760);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> (int) void
   class_75(int var1) {
      super();
      try {
         this.field_602 = -802165351;
         this.field_601 = 1235557667;
         this.field_599 = 0;
         this.field_608 = true;
         this.field_609 = false;
         this.field_610 = new String[5];
         this.field_613 = -1090934265;
         this.field_622 = -1441210903;
         this.field_615 = Integer.MIN_VALUE;
         this.field_616 = Integer.MIN_VALUE;
         this.field_617 = class_213.field_2439;
         this.field_603 = class_212.field_2432;
         this.field_621 = -909096585;
         this.field_607 = var1 * -1329653491;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: b (int) int
   public int method_1136() {
      try {
         return this.field_607 * -298295867;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(256);
      field_598 = var10000;
   }

   // $FF: renamed from: f (nd, int) void
   void method_1138(class_28 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method_130();
            if(var3 == 0) {
               if(var2 >= 184858367) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1132(var1, var3, -1414929060);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: k () void
   void method_1139() {
      if(this.field_612 != null) {
         for(int var1 = 0; var1 < this.field_612.length; var1 += 2) {
            if(this.field_612[var1] < -1280941503 * this.field_613) {
               this.field_613 = -1056549383 * this.field_612[var1];
            } else if(this.field_612[var1] > 1059928721 * this.field_615) {
               this.field_615 = this.field_612[var1] * 309184113;
            }

            if(this.field_612[var1 + 1] < 98307412 * this.field_622) {
               this.field_622 = this.field_612[var1 + 1] * -706272745;
            } else if(this.field_612[var1 + 1] > this.field_616 * 1973085676) {
               this.field_616 = -849517983 * this.field_612[var1 + 1];
            }
         }
      }

   }

   // $FF: renamed from: u (int) ew
   public static class_75 method_1140(int var0) {
      if(var0 >= 0 && var0 < field_614.length && null != field_614[var0]) {
         return field_614[var0];
      } else {
         class_75 var10000 = new class_75(var0);
         return var10000;
      }
   }

   // $FF: renamed from: l (nd) void
   void method_1141(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1132(var1, var2, -1613793380);
      }
   }

   // $FF: renamed from: o (nd) void
   void method_1142(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1132(var1, var2, -901135382);
      }
   }

   // $FF: renamed from: d (jv, jv) boolean
   public static boolean method_1143(class_306 var0, class_306 var1) {
      field_618 = var1;
      if(!var0.method_5423(2068645108)) {
         return false;
      } else {
         class_331.field_3858 = var0.method_5393(35) * -1720116175;
         field_614 = new class_75[-617825071 * class_331.field_3858];

         for(int var2 = 0; var2 < -617825071 * class_331.field_3858; ++var2) {
            byte[] var3 = var0.method_5381(35, var2);
            class_75[] var10000 = field_614;
            class_75 var10002 = new class_75(var2);
            var10000[var2] = var10002;
            if(var3 != null) {
               class_75 var4 = field_614[var2];
               class_28 var10001 = new class_28(var3);
               var4.method_1138(var10001, -912100201);
               field_614[var2].method_1133(-832218591);
            }
         }

         return true;
      }
   }

   // $FF: renamed from: e (nd) void
   void method_1144(class_28 var1) {
      while(true) {
         int var2 = var1.method_130();
         if(var2 == 0) {
            return;
         }

         this.method_1132(var1, var2, -1545292934);
      }
   }

   // $FF: renamed from: g (nd, int) void
   void method_1145(class_28 var1, int var2) {
      if(1 == var2) {
         this.field_602 = var1.method_147(1715356416) * 802165351;
      } else if(2 == var2) {
         this.field_601 = var1.method_147(2053693962) * -1235557667;
      } else if(3 == var2) {
         this.field_604 = var1.method_139(-391631059);
      } else if(4 == var2) {
         this.field_605 = var1.method_134() * 1712869385;
      } else if(5 == var2) {
         var1.method_134();
      } else if(6 == var2) {
         this.field_599 = var1.method_130() * -1615731849;
      } else {
         int var3;
         if(var2 == 7) {
            var3 = var1.method_130();
            if((var3 & 1) == 0) {
               this.field_608 = false;
            }

            if(2 == (var3 & 2)) {
               this.field_609 = true;
            }
         } else if(8 == var2) {
            var1.method_130();
         } else if(var2 >= 10 && var2 <= 14) {
            this.field_610[var2 - 10] = var1.method_139(-391631059);
         } else if(var2 == 15) {
            var3 = var1.method_130();
            this.field_612 = new int[2 * var3];

            int var4;
            for(var4 = 0; var4 < var3 * 2; ++var4) {
               this.field_612[var4] = var1.method_269(-1542485131);
            }

            var1.method_135();
            var4 = var1.method_130();
            this.field_619 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field_619.length; ++var5) {
               this.field_619[var5] = var1.method_135();
            }

            this.field_620 = new byte[var3];

            for(var5 = 0; var5 < var3; ++var5) {
               this.field_620[var5] = var1.method_131();
            }
         } else if(16 != var2) {
            if(17 == var2) {
               this.field_611 = var1.method_139(-391631059);
            } else if(var2 == 18) {
               var1.method_147(1387153606);
            } else if(var2 == 19) {
               this.field_621 = var1.method_132() * 909096585;
            } else if(var2 == 21) {
               var1.method_135();
            } else if(var2 == 22) {
               var1.method_135();
            } else if(var2 == 23) {
               var1.method_130();
               var1.method_130();
               var1.method_130();
            } else if(var2 == 24) {
               var1.method_269(-1542485131);
               var1.method_269(-1542485131);
            } else if(25 == var2) {
               var1.method_147(1735850938);
            } else if(var2 == 28) {
               var1.method_130();
            } else if(29 == var2) {
               this.field_617 = (class_213)class_197.method_4016(class_82.method_1374(), var1.method_130(), -611336247);
            } else if(var2 == 30) {
               this.field_603 = (class_212)class_197.method_4016(class_163.method_3418(), var1.method_130(), -611336247);
            }
         }
      }

   }

   // $FF: renamed from: a () void
   void method_1146() {
      if(this.field_612 != null) {
         for(int var1 = 0; var1 < this.field_612.length; var1 += 2) {
            if(this.field_612[var1] < 61627465 * this.field_613) {
               this.field_613 = -1056549383 * this.field_612[var1];
            } else if(this.field_612[var1] > 1059928721 * this.field_615) {
               this.field_615 = this.field_612[var1] * 309184113;
            }

            if(this.field_612[var1 + 1] < -1855572569 * this.field_622) {
               this.field_622 = this.field_612[var1 + 1] * -706272745;
            } else if(this.field_612[var1 + 1] > this.field_616 * 1980828279) {
               this.field_616 = -87560377 * this.field_612[var1 + 1];
            }
         }
      }

   }

   // $FF: renamed from: w () int
   public int method_1147() {
      return this.field_607 * -654228162;
   }

   // $FF: renamed from: m () void
   void method_1148() {
      if(this.field_612 != null) {
         for(int var1 = 0; var1 < this.field_612.length; var1 += 2) {
            if(this.field_612[var1] < 1242352863 * this.field_613) {
               this.field_613 = -1056549383 * this.field_612[var1];
            } else if(this.field_612[var1] > 1059928721 * this.field_615) {
               this.field_615 = this.field_612[var1] * 1053116643;
            }

            if(this.field_612[var1 + 1] < 1296809432 * this.field_622) {
               this.field_622 = this.field_612[var1 + 1] * -706272745;
            } else if(this.field_612[var1 + 1] > this.field_616 * 2072501575) {
               this.field_616 = -1420192528 * this.field_612[var1 + 1];
            }
         }
      }

   }

   // $FF: renamed from: x (boolean) oh
   public class_67 method_1149(boolean var1) {
      int var2 = var1?1973945717 * this.field_601:300345687 * this.field_602;
      return this.method_1151(var2, 2133010886);
   }

   // $FF: renamed from: s (jv, jv) boolean
   public static boolean method_1150(class_306 var0, class_306 var1) {
      field_618 = var1;
      if(!var0.method_5423(2117730086)) {
         return false;
      } else {
         class_331.field_3858 = var0.method_5393(35) * -1720116175;
         field_614 = new class_75[-617825071 * class_331.field_3858];

         for(int var2 = 0; var2 < -617825071 * class_331.field_3858; ++var2) {
            byte[] var3 = var0.method_5381(35, var2);
            class_75[] var10000 = field_614;
            class_75 var10002 = new class_75(var2);
            var10000[var2] = var10002;
            if(var3 != null) {
               class_75 var4 = field_614[var2];
               class_28 var10001 = new class_28(var3);
               var4.method_1138(var10001, -1711635387);
               field_614[var2].method_1133(-260656956);
            }
         }

         return true;
      }
   }

   // $FF: renamed from: r (int, int) oh
   class_67 method_1151(int var1, int var2) {
      try {
         if(var1 < 0) {
            if(var2 <= 2130552221) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            class_67 var3 = (class_67)field_598.method_5065((long)var1);
            if(var3 != null) {
               return var3;
            } else {
               var3 = class_266.method_5032(field_618, var1, 0, (byte)71);
               if(var3 != null) {
                  if(var2 <= 2130552221) {
                     throw new IllegalStateException();
                  }

                  field_598.method_5064(var3, (long)var1);
               }

               return var3;
            }
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: t () int
   public int method_1152() {
      return this.field_607 * -298295867;
   }

   // $FF: renamed from: h () int
   public int method_1153() {
      return this.field_607 * -298295867;
   }

   // $FF: renamed from: q () int
   public int method_1154() {
      return this.field_607 * -298295867;
   }

   // $FF: renamed from: g (int, int, int, int) int
   static final int method_1155(int var0, int var1, int var2, int var3) {
      try {
         if(var2 > 179) {
            var1 /= 2;
         }

         if(var2 > 192) {
            if(var3 != -1291818540) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if(var2 > 217) {
            if(var3 != -1291818540) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if(var2 > 243) {
            if(var3 != -1291818540) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         int var4 = (var0 / 4 << 10) + (var1 / 32 << 7) + var2 / 2;
         return var4;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: z (boolean) oh
   public class_67 method_1156(boolean var1) {
      int var2 = var1?1973945717 * this.field_601:300345687 * this.field_602;
      return this.method_1151(var2, 2141295892);
   }
}
