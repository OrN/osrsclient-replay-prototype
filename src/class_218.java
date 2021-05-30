
// $FF: renamed from: gq
public abstract class class_218 {

   // $FF: renamed from: s int
   int field_2479;
   // $FF: renamed from: b ii
   public final class_280 field_2480;
   // $FF: renamed from: d int
   int field_2481;
   // $FF: renamed from: r ii
   public final class_280 field_2482;


   // $FF: renamed from: c () int
   abstract int method_4203();

   // $FF: renamed from: ap (int, int) boolean
   boolean method_4204(int var1, int var2) {
      class_237 var3 = this.method_4206(1063541181);
      return null == var3?false:(var1 >= this.field_2481 * 1619813951 - -1781114869 * var3.field_2640 / 2 && var1 <= var3.field_2640 * -2014133071 / 2 + 1619813951 * this.field_2481?var2 >= -162267613 * this.field_2479 && var2 <= var3.field_2641 * -733130897 + this.field_2479 * 1798701135:false);
   }

   // $FF: renamed from: n (int) int
   public abstract int method_4205(int var1);

   // $FF: renamed from: f (int) fv
   abstract class_237 method_4206(int var1);

   // $FF: renamed from: y (int) int
   abstract int method_4207(int var1);

   // $FF: renamed from: o () int
   abstract int method_4208();

   // $FF: renamed from: g (int) boolean
   boolean method_4209(int var1) {
      try {
         boolean var10000;
         if(this.method_4205(2146555538) >= 0) {
            if(var1 <= -687742651) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "gq.g(" + ')');
      }
   }

   // $FF: renamed from: a (int, int, int) boolean
   boolean method_4210(int var1, int var2, int var3) {
      try {
         if(!this.method_4209(244885152)) {
            if(var3 == -89779169) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            class_75 var4 = class_116.method_2248(this.method_4205(2145215263), 1647125333);
            int var5 = this.method_4207(-1949510660);
            int var6 = this.method_4228((byte)-85);
            switch(var4.field_617.field_2441 * -161686761) {
            case 0:
               if(var1 >= this.field_2481 * 1619813951 - var5 / 2) {
                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }

                  if(var1 <= 1619813951 * this.field_2481 + var5 / 2) {
                     break;
                  }

                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            case 1:
               if(var1 > this.field_2481 * 1619813951 - var5) {
                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }

                  if(var1 <= this.field_2481 * 1619813951) {
                     break;
                  }

                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            case 2:
               label109: {
                  if(var1 >= this.field_2481 * 1619813951) {
                     if(var3 == -89779169) {
                        throw new IllegalStateException();
                     }

                     if(var1 < this.field_2481 * 1619813951 + var5) {
                        break label109;
                     }

                     if(var3 == -89779169) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               }
            }

            switch(var4.field_603.field_2436 * -1918765839) {
            case 0:
               if(var2 > this.field_2479 * 1123629873 - var6) {
                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }

                  if(var2 <= 1123629873 * this.field_2479) {
                     break;
                  }

                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            case 1:
               if(var2 >= 1123629873 * this.field_2479 - var6 / 2) {
                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }

                  if(var2 <= this.field_2479 * 1123629873 + var6 / 2) {
                     break;
                  }

                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            case 2:
               if(var2 >= 1123629873 * this.field_2479) {
                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }

                  if(var2 < 1123629873 * this.field_2479 + var6) {
                     return true;
                  }

                  if(var3 == -89779169) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            }

            return true;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "gq.a(" + ')');
      }
   }

   // $FF: renamed from: k (int, int, int) boolean
   boolean method_4211(int var1, int var2, int var3) {
      try {
         class_237 var4 = this.method_4206(39460369);
         if(null == var4) {
            if(var3 != 280751135) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if(var1 >= this.field_2481 * 1619813951 - -1781114869 * var4.field_2640 / 2) {
               if(var3 != 280751135) {
                  throw new IllegalStateException();
               }

               if(var1 <= var4.field_2640 * -1781114869 / 2 + 1619813951 * this.field_2481) {
                  if(var2 >= 1123629873 * this.field_2479) {
                     if(var3 != 280751135) {
                        throw new IllegalStateException();
                     }

                     if(var2 <= var4.field_2641 * -733130897 + this.field_2479 * 1123629873) {
                        return true;
                     }

                     if(var3 != 280751135) {
                        throw new IllegalStateException();
                     }
                  }

                  return false;
               }

               if(var3 != 280751135) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "gq.k(" + ')');
      }
   }

   // $FF: renamed from: b () int
   public abstract int method_4212();

   // $FF: renamed from: d () int
   public abstract int method_4213();

   // $FF: renamed from: s () int
   public abstract int method_4214();

   // $FF: renamed from: u () fv
   abstract class_237 method_4215();

   // $FF: renamed from: l () int
   abstract int method_4216();

   // $FF: renamed from: t (int, int) boolean
   boolean method_4217(int var1, int var2) {
      if(!this.method_4209(1845144120)) {
         return false;
      } else {
         class_75 var3 = class_116.method_2248(this.method_4205(2145746980), 1647125333);
         int var4 = this.method_4207(-172147766);
         int var5 = this.method_4228((byte)-108);
         switch(var3.field_617.field_2441 * -161686761) {
         case 0:
            if(var1 < this.field_2481 * 1619813951 - var4 / 2 || var1 > 1619813951 * this.field_2481 + var4 / 2) {
               return false;
            }
            break;
         case 1:
            if(var1 <= this.field_2481 * 1619813951 - var4 || var1 > this.field_2481 * 1619813951) {
               return false;
            }
            break;
         case 2:
            if(var1 < this.field_2481 * 1619813951 || var1 >= this.field_2481 * 1619813951 + var4) {
               return false;
            }
         }

         switch(var3.field_603.field_2436 * -1918765839) {
         case 0:
            if(var2 <= this.field_2479 * 1123629873 - var5 || var2 > 1123629873 * this.field_2479) {
               return false;
            }
            break;
         case 1:
            if(var2 < 1123629873 * this.field_2479 - var5 / 2 || var2 > this.field_2479 * 1123629873 + var5 / 2) {
               return false;
            }
            break;
         case 2:
            if(var2 < 1123629873 * this.field_2479 || var2 >= 1123629873 * this.field_2479 + var5) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: i (int, int) boolean
   boolean method_4218(int var1, int var2) {
      class_237 var3 = this.method_4206(943048841);
      return null == var3?false:(var1 >= this.field_2481 * 1619813951 - -1781114869 * var3.field_2640 / 2 && var1 <= var3.field_2640 * -1781114869 / 2 + 1619813951 * this.field_2481?var2 >= 1123629873 * this.field_2479 && var2 <= var3.field_2641 * -733130897 + this.field_2479 * 1123629873:false);
   }

   // $FF: renamed from: m (int, int) boolean
   boolean method_4219(int var1, int var2) {
      return this.method_4210(var1, var2, -1141564913)?true:this.method_4211(var1, var2, 280751135);
   }

   // $FF: renamed from: x () boolean
   boolean method_4220() {
      return this.method_4205(2146917765) >= 0;
   }

   // $FF: renamed from: z () boolean
   boolean method_4221() {
      return this.method_4205(2147275242) >= 0;
   }

   // $FF: renamed from: w () boolean
   boolean method_4222() {
      return this.method_4205(2145208324) >= 0;
   }

   // $FF: renamed from: <init> (ii, ii) void
   void method_4223(class_280 var1, class_280 var2) {
      try {
         super();
         this.field_2480 = var1;
         this.field_2482 = var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "gq.<init>(" + ')');
      }
   }

   // $FF: renamed from: e (int, int, short) boolean
   boolean method_4224(int var1, int var2, short var3) {
      try {
         if(this.method_4210(var1, var2, 561352542)) {
            if(var3 == 6630) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if(this.method_4211(var1, var2, 280751135)) {
            if(var3 == 6630) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "gq.e(" + ')');
      }
   }

   // $FF: renamed from: q (int, int) boolean
   boolean method_4225(int var1, int var2) {
      if(!this.method_4209(1652840999)) {
         return false;
      } else {
         class_75 var3 = class_116.method_2248(this.method_4205(2145583142), 1647125333);
         int var4 = this.method_4207(685602415);
         int var5 = this.method_4228((byte)-36);
         switch(var3.field_617.field_2441 * 1078924793) {
         case 0:
            if(var1 < this.field_2481 * -785531653 - var4 / 2 || var1 > 1619813951 * this.field_2481 + var4 / 2) {
               return false;
            }
            break;
         case 1:
            if(var1 <= this.field_2481 * 1619813951 - var4 || var1 > this.field_2481 * 1619813951) {
               return false;
            }
            break;
         case 2:
            if(var1 < this.field_2481 * 1619813951 || var1 >= this.field_2481 * -1651438662 + var4) {
               return false;
            }
         }

         switch(var3.field_603.field_2436 * -1918765839) {
         case 0:
            if(var2 <= this.field_2479 * 1123629873 - var5 || var2 > 1966929993 * this.field_2479) {
               return false;
            }
            break;
         case 1:
            if(var2 < 1123629873 * this.field_2479 - var5 / 2 || var2 > this.field_2479 * 421411815 + var5 / 2) {
               return false;
            }
            break;
         case 2:
            if(var2 < 1123629873 * this.field_2479 || var2 >= 644206455 * this.field_2479 + var5) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: h (int, int) boolean
   boolean method_4226(int var1, int var2) {
      if(!this.method_4209(736731858)) {
         return false;
      } else {
         class_75 var3 = class_116.method_2248(this.method_4205(2146620034), 1647125333);
         int var4 = this.method_4207(-1526523032);
         int var5 = this.method_4228((byte)-8);
         switch(var3.field_617.field_2441 * -161686761) {
         case 0:
            if(var1 < this.field_2481 * 1619813951 - var4 / 2 || var1 > 1619813951 * this.field_2481 + var4 / 2) {
               return false;
            }
            break;
         case 1:
            if(var1 <= this.field_2481 * 1619813951 - var4 || var1 > this.field_2481 * 1619813951) {
               return false;
            }
            break;
         case 2:
            if(var1 < this.field_2481 * 1619813951 || var1 >= this.field_2481 * 1619813951 + var4) {
               return false;
            }
         }

         switch(var3.field_603.field_2436 * -1918765839) {
         case 0:
            if(var2 <= this.field_2479 * 1123629873 - var5 || var2 > 1123629873 * this.field_2479) {
               return false;
            }
            break;
         case 1:
            if(var2 < 1123629873 * this.field_2479 - var5 / 2 || var2 > this.field_2479 * 1123629873 + var5 / 2) {
               return false;
            }
            break;
         case 2:
            if(var2 < 1123629873 * this.field_2479 || var2 >= 1123629873 * this.field_2479 + var5) {
               return false;
            }
         }

         return true;
      }
   }

   // $FF: renamed from: ae (int, int) boolean
   boolean method_4227(int var1, int var2) {
      class_237 var3 = this.method_4206(1422527132);
      return null == var3?false:(var1 >= this.field_2481 * 1619813951 - -1781114869 * var3.field_2640 / 2 && var1 <= var3.field_2640 * -1781114869 / 2 + 1619813951 * this.field_2481?var2 >= 1123629873 * this.field_2479 && var2 <= var3.field_2641 * -733130897 + this.field_2479 * 1123629873:false);
   }

   // $FF: renamed from: p (byte) int
   abstract int method_4228(byte var1);
}
