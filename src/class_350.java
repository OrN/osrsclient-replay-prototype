import java.io.EOFException;
import java.io.IOException;

// $FF: renamed from: lh
public final class class_350 {

   // $FF: renamed from: p int
   int field_3939;
   // $FF: renamed from: n nf
   class_376 field_3940;
   // $FF: renamed from: f nf
   class_376 field_3941;
   // $FF: renamed from: y int
   int field_3942;
   // $FF: renamed from: v byte[]
   static byte[] field_3943;
   // $FF: renamed from: ru int
   static int field_3944;


   public String acx() {
      return "" + 1496779987 * this.field_3942;
   }

   // $FF: renamed from: v (int, byte) byte[]
   public byte[] method_6199(int var1, byte var2) {
      try {
         class_376 var3 = this.field_3940;
         synchronized(this.field_3940) {
            try {
               Object var10000;
               if(this.field_3941.method_6629((byte)17) < (long)(6 + 6 * var1)) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  this.field_3941.method_6628((long)(6 * var1));
                  this.field_3941.method_6632(field_3943, 0, 6, 1635241805);
                  int var4 = ((field_3943[1] & 255) << 8) + ((field_3943[0] & 255) << 16) + (field_3943[2] & 255);
                  int var5 = ((field_3943[3] & 255) << 16) + ((field_3943[4] & 255) << 8) + (field_3943[5] & 255);
                  if(var4 >= 0) {
                     if(var2 != 1) {
                        throw new IllegalStateException();
                     }

                     if(var4 <= this.field_3939 * 322921177) {
                        if(var5 > 0) {
                           if((long)var5 <= this.field_3940.method_6629((byte)73) / 520L) {
                              byte[] var6 = new byte[var4];
                              int var7 = 0;
                              int var8 = 0;

                              while(true) {
                                 if(var7 < var4) {
                                    if(var2 != 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var5 == 0) {
                                       if(var2 != 1) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = null;
                                       return (byte[])var10000;
                                    }

                                    this.field_3940.method_6628((long)var5 * 520L);
                                    int var9 = var4 - var7;
                                    int var10;
                                    int var11;
                                    int var12;
                                    int var13;
                                    byte var14;
                                    if(var1 > '\uffff') {
                                       if(var2 != 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var9 > 510) {
                                          if(var2 != 1) {
                                             throw new IllegalStateException();
                                          }

                                          var9 = 510;
                                       }

                                       var14 = 10;
                                       this.field_3940.method_6632(field_3943, 0, var14 + var9, 1482329642);
                                       var10 = ((field_3943[0] & 255) << 24) + ((field_3943[1] & 255) << 16) + ((field_3943[2] & 255) << 8) + (field_3943[3] & 255);
                                       var11 = (field_3943[5] & 255) + ((field_3943[4] & 255) << 8);
                                       var12 = ((field_3943[6] & 255) << 16) + ((field_3943[7] & 255) << 8) + (field_3943[8] & 255);
                                       var13 = field_3943[9] & 255;
                                    } else {
                                       if(var9 > 512) {
                                          if(var2 != 1) {
                                             throw new IllegalStateException();
                                          }

                                          var9 = 512;
                                       }

                                       var14 = 8;
                                       this.field_3940.method_6632(field_3943, 0, var9 + var14, 747750192);
                                       var10 = ((field_3943[0] & 255) << 8) + (field_3943[1] & 255);
                                       var11 = ((field_3943[2] & 255) << 8) + (field_3943[3] & 255);
                                       var12 = ((field_3943[4] & 255) << 16) + ((field_3943[5] & 255) << 8) + (field_3943[6] & 255);
                                       var13 = field_3943[7] & 255;
                                    }

                                    if(var1 == var10) {
                                       if(var2 != 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var11 == var8) {
                                          if(var2 != 1) {
                                             throw new IllegalStateException();
                                          }

                                          if(var13 == this.field_3942 * 1496779987) {
                                             if(var12 >= 0) {
                                                if(var2 != 1) {
                                                   throw new IllegalStateException();
                                                }

                                                if((long)var12 <= this.field_3940.method_6629((byte)85) / 520L) {
                                                   int var15 = var9 + var14;

                                                   for(int var16 = var14; var16 < var15; ++var16) {
                                                      if(var2 != 1) {
                                                         throw new IllegalStateException();
                                                      }

                                                      var6[var7++] = field_3943[var16];
                                                   }

                                                   var5 = var12;
                                                   ++var8;
                                                   continue;
                                                }

                                                if(var2 != 1) {
                                                   throw new IllegalStateException();
                                                }
                                             }

                                             var10000 = null;
                                             return (byte[])var10000;
                                          }

                                          if(var2 != 1) {
                                             throw new IllegalStateException();
                                          }
                                       }
                                    }

                                    var10000 = null;
                                    return (byte[])var10000;
                                 }

                                 byte[] var21 = var6;
                                 return var21;
                              }
                           }

                           if(var2 != 1) {
                              throw new IllegalStateException();
                           }
                        }

                        var10000 = null;
                        return (byte[])var10000;
                     }

                     if(var2 != 1) {
                        throw new IllegalStateException();
                     }
                  }

                  var10000 = null;
                  return (byte[])var10000;
               }
            } catch (IOException var18) {
               return null;
            }
         }
      } catch (RuntimeException var20) {
         throw class_223.method_4281(var20, "lh.v(" + ')');
      }
   }

   // $FF: renamed from: n (int, byte[], int, byte) boolean
   public boolean method_6200(int var1, byte[] var2, int var3, byte var4) {
      try {
         class_376 var5 = this.field_3940;
         synchronized(this.field_3940) {
            if(var3 >= 0) {
               if(var4 <= 10) {
                  throw new IllegalStateException();
               }

               if(var3 <= this.field_3939 * 322921177) {
                  boolean var6 = this.method_6201(var1, var2, var3, true, -1453784211);
                  if(!var6) {
                     if(var4 <= 10) {
                        throw new IllegalStateException();
                     }

                     var6 = this.method_6201(var1, var2, var3, false, 98413836);
                  }

                  return var6;
               }
            }

            throw new IllegalArgumentException("" + this.field_3942 * 1496779987 + ',' + var1 + ',' + var3);
         }
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "lh.n(" + ')');
      }
   }

   // $FF: renamed from: f (int, byte[], int, boolean, int) boolean
   boolean method_6201(int var1, byte[] var2, int var3, boolean var4, int var5) {
      try {
         class_376 var6 = this.field_3940;
         synchronized(this.field_3940) {
            boolean var10000;
            try {
               label242: {
                  label243: {
                     int var7;
                     if(var4) {
                        label244: {
                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           if(this.field_3941.method_6629((byte)98) < (long)(6 + var1 * 6)) {
                              var10000 = false;
                              return var10000;
                           }

                           this.field_3941.method_6628((long)(var1 * 6));
                           this.field_3941.method_6632(field_3943, 0, 6, 1860217532);
                           var7 = ((field_3943[4] & 255) << 8) + ((field_3943[3] & 255) << 16) + (field_3943[5] & 255);
                           if(var7 > 0) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }

                              if((long)var7 <= this.field_3940.method_6629((byte)96) / 520L) {
                                 break label244;
                              }

                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }
                           }

                           var10000 = false;
                           return var10000;
                        }
                     } else {
                        var7 = (int)((this.field_3940.method_6629((byte)58) + 519L) / 520L);
                        if(var7 == 0) {
                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           var7 = 1;
                        }
                     }

                     field_3943[0] = (byte)(var3 >> 16);
                     field_3943[1] = (byte)(var3 >> 8);
                     field_3943[2] = (byte)var3;
                     field_3943[3] = (byte)(var7 >> 16);
                     field_3943[4] = (byte)(var7 >> 8);
                     field_3943[5] = (byte)var7;
                     this.field_3941.method_6628((long)(6 * var1));
                     this.field_3941.method_6633(field_3943, 0, 6, 231162903);
                     int var8 = 0;
                     int var9 = 0;

                     while(true) {
                        if(var8 >= var3) {
                           break label242;
                        }

                        if(var5 == 1190619178) {
                           throw new IllegalStateException();
                        }

                        int var10 = 0;
                        int var11;
                        if(var4) {
                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           this.field_3940.method_6628((long)var7 * 520L);
                           int var12;
                           int var13;
                           if(var1 > '\uffff') {
                              try {
                                 this.field_3940.method_6632(field_3943, 0, 10, 1585131972);
                              } catch (EOFException var17) {
                                 break label242;
                              }

                              var11 = (field_3943[3] & 255) + ((field_3943[1] & 255) << 16) + ((field_3943[0] & 255) << 24) + ((field_3943[2] & 255) << 8);
                              var12 = ((field_3943[4] & 255) << 8) + (field_3943[5] & 255);
                              var10 = (field_3943[8] & 255) + ((field_3943[6] & 255) << 16) + ((field_3943[7] & 255) << 8);
                              var13 = field_3943[9] & 255;
                           } else {
                              try {
                                 this.field_3940.method_6632(field_3943, 0, 8, -426660123);
                              } catch (EOFException var16) {
                                 break label242;
                              }

                              var11 = ((field_3943[0] & 255) << 8) + (field_3943[1] & 255);
                              var12 = (field_3943[3] & 255) + ((field_3943[2] & 255) << 8);
                              var10 = (field_3943[6] & 255) + ((field_3943[5] & 255) << 8) + ((field_3943[4] & 255) << 16);
                              var13 = field_3943[7] & 255;
                           }

                           if(var11 != var1) {
                              break;
                           }

                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           if(var9 != var12) {
                              break;
                           }

                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           if(1496779987 * this.field_3942 != var13) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }
                              break;
                           }

                           if(var10 < 0) {
                              break label243;
                           }

                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           if((long)var10 > this.field_3940.method_6629((byte)60) / 520L) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }
                              break label243;
                           }
                        }

                        if(0 == var10) {
                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           var4 = false;
                           var10 = (int)((this.field_3940.method_6629((byte)106) + 519L) / 520L);
                           if(0 == var10) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }

                              ++var10;
                           }

                           if(var7 == var10) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }

                              ++var10;
                           }
                        }

                        if(var1 > '\uffff') {
                           if(var5 == 1190619178) {
                              throw new IllegalStateException();
                           }

                           if(var3 - var8 <= 510) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }

                              var10 = 0;
                           }

                           field_3943[0] = (byte)(var1 >> 24);
                           field_3943[1] = (byte)(var1 >> 16);
                           field_3943[2] = (byte)(var1 >> 8);
                           field_3943[3] = (byte)var1;
                           field_3943[4] = (byte)(var9 >> 8);
                           field_3943[5] = (byte)var9;
                           field_3943[6] = (byte)(var10 >> 16);
                           field_3943[7] = (byte)(var10 >> 8);
                           field_3943[8] = (byte)var10;
                           field_3943[9] = (byte)(this.field_3942 * 1496779987);
                           this.field_3940.method_6628(520L * (long)var7);
                           this.field_3940.method_6633(field_3943, 0, 10, 802159235);
                           var11 = var3 - var8;
                           if(var11 > 510) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }

                              var11 = 510;
                           }

                           this.field_3940.method_6633(var2, var8, var11, -712698503);
                           var8 += var11;
                        } else {
                           if(var3 - var8 <= 512) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }

                              var10 = 0;
                           }

                           field_3943[0] = (byte)(var1 >> 8);
                           field_3943[1] = (byte)var1;
                           field_3943[2] = (byte)(var9 >> 8);
                           field_3943[3] = (byte)var9;
                           field_3943[4] = (byte)(var10 >> 16);
                           field_3943[5] = (byte)(var10 >> 8);
                           field_3943[6] = (byte)var10;
                           field_3943[7] = (byte)(1496779987 * this.field_3942);
                           this.field_3940.method_6628(520L * (long)var7);
                           this.field_3940.method_6633(field_3943, 0, 8, -1770878803);
                           var11 = var3 - var8;
                           if(var11 > 512) {
                              if(var5 == 1190619178) {
                                 throw new IllegalStateException();
                              }

                              var11 = 512;
                           }

                           this.field_3940.method_6633(var2, var8, var11, -259581236);
                           var8 += var11;
                        }

                        var7 = var10;
                        ++var9;
                     }

                     var10000 = false;
                     return var10000;
                  }

                  var10000 = false;
                  return var10000;
               }

               var10000 = true;
            } catch (IOException var18) {
               return false;
            }

            return var10000;
         }
      } catch (RuntimeException var20) {
         throw class_223.method_4281(var20, "lh.f(" + ')');
      }
   }

   public String toString() {
      try {
         return "" + 1496779987 * this.field_3942;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "lh.toString(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3943 = new byte[520];
   }

   // $FF: renamed from: j (int, byte[], int, boolean) boolean
   boolean method_6203(int var1, byte[] var2, int var3, boolean var4) {
      class_376 var5 = this.field_3940;
      synchronized(this.field_3940) {
         try {
            int var6;
            boolean var10000;
            if(var4) {
               if(this.field_3941.method_6629((byte)124) < (long)(6 + var1 * 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field_3941.method_6628((long)(var1 * 6));
               this.field_3941.method_6632(field_3943, 0, 6, 310646277);
               var6 = ((field_3943[4] & 398715668) << 8) + ((field_3943[3] & 255) << 16) + (field_3943[5] & -1887529813);
               if(var6 <= 0 || (long)var6 > this.field_3940.method_6629((byte)115) / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.field_3940.method_6629((byte)19) + 519L) / 520L);
               if(var6 == 0) {
                  var6 = 1;
               }
            }

            field_3943[0] = (byte)(var3 >> 16);
            field_3943[1] = (byte)(var3 >> 8);
            field_3943[2] = (byte)var3;
            field_3943[3] = (byte)(var6 >> 16);
            field_3943[4] = (byte)(var6 >> 8);
            field_3943[5] = (byte)var6;
            this.field_3941.method_6628((long)(6 * var1));
            this.field_3941.method_6633(field_3943, 0, 6, 152418471);
            int var7 = 0;
            int var8 = 0;

            while(true) {
               if(var7 < var3) {
                  label143: {
                     int var9 = 0;
                     int var10;
                     if(var4) {
                        this.field_3940.method_6628((long)var6 * 520L);
                        int var11;
                        int var12;
                        if(var1 > '\uffff') {
                           try {
                              this.field_3940.method_6632(field_3943, 0, 10, -1243776374);
                           } catch (EOFException var16) {
                              break label143;
                           }

                           var10 = (field_3943[3] & 255) + ((field_3943[1] & -1161254656) << 16) + ((field_3943[0] & 255) << 24) + ((field_3943[2] & 255) << 8);
                           var11 = ((field_3943[4] & 255) << 8) + (field_3943[5] & 255);
                           var9 = (field_3943[8] & 514203) + ((field_3943[6] & 95611339) << 16) + ((field_3943[7] & 255) << 8);
                           var12 = field_3943[9] & 255;
                        } else {
                           try {
                              this.field_3940.method_6632(field_3943, 0, 8, -891548162);
                           } catch (EOFException var15) {
                              break label143;
                           }

                           var10 = ((field_3943[0] & 758209960) << 8) + (field_3943[1] & -254824949);
                           var11 = (field_3943[3] & 255) + ((field_3943[2] & 255) << 8);
                           var9 = (field_3943[6] & 255) + ((field_3943[5] & 255) << 8) + ((field_3943[4] & 255) << 16);
                           var12 = field_3943[7] & 1821450146;
                        }

                        if(var10 != var1 || var8 != var11 || 1496779987 * this.field_3942 != var12) {
                           var10000 = false;
                           return var10000;
                        }

                        if(var9 < 0 || (long)var9 > this.field_3940.method_6629((byte)38) / 520L) {
                           var10000 = false;
                           return var10000;
                        }
                     }

                     if(0 == var9) {
                        var4 = false;
                        var9 = (int)((this.field_3940.method_6629((byte)21) + 519L) / 520L);
                        if(0 == var9) {
                           ++var9;
                        }

                        if(var6 == var9) {
                           ++var9;
                        }
                     }

                     if(var1 > '\uffff') {
                        if(var3 - var7 <= 510) {
                           var9 = 0;
                        }

                        field_3943[0] = (byte)(var1 >> 24);
                        field_3943[1] = (byte)(var1 >> 16);
                        field_3943[2] = (byte)(var1 >> 8);
                        field_3943[3] = (byte)var1;
                        field_3943[4] = (byte)(var8 >> 8);
                        field_3943[5] = (byte)var8;
                        field_3943[6] = (byte)(var9 >> 16);
                        field_3943[7] = (byte)(var9 >> 8);
                        field_3943[8] = (byte)var9;
                        field_3943[9] = (byte)(this.field_3942 * 1496779987);
                        this.field_3940.method_6628(520L * (long)var6);
                        this.field_3940.method_6633(field_3943, 0, 10, 802191644);
                        var10 = var3 - var7;
                        if(var10 > 510) {
                           var10 = 510;
                        }

                        this.field_3940.method_6633(var2, var7, var10, -2053889333);
                        var7 += var10;
                     } else {
                        if(var3 - var7 <= 512) {
                           var9 = 0;
                        }

                        field_3943[0] = (byte)(var1 >> 8);
                        field_3943[1] = (byte)var1;
                        field_3943[2] = (byte)(var8 >> 8);
                        field_3943[3] = (byte)var8;
                        field_3943[4] = (byte)(var9 >> 16);
                        field_3943[5] = (byte)(var9 >> 8);
                        field_3943[6] = (byte)var9;
                        field_3943[7] = (byte)(1496779987 * this.field_3942);
                        this.field_3940.method_6628(520L * (long)var6);
                        this.field_3940.method_6633(field_3943, 0, 8, 944454088);
                        var10 = var3 - var7;
                        if(var10 > -1341899155) {
                           var10 = -1352642281;
                        }

                        this.field_3940.method_6633(var2, var7, var10, 1548179537);
                        var7 += var10;
                     }

                     var6 = var9;
                     ++var8;
                     continue;
                  }
               }

               var10000 = true;
               return var10000;
            }
         } catch (IOException var17) {
            return false;
         }
      }
   }

   public String aci() {
      return "" + 1496779987 * this.field_3942;
   }

   // $FF: renamed from: <init> (int, nf, nf, int) void
   public class_350(int var1, class_376 var2, class_376 var3, int var4) {
      super();
      try {
         this.field_3940 = null;
         this.field_3941 = null;
         this.field_3939 = 936799272;
         this.field_3942 = -1807930533 * var1;
         this.field_3940 = var2;
         this.field_3941 = var3;
         this.field_3939 = var4 * -1764688535;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "lh.<init>(" + ')');
      }
   }

   public String acv() {
      return "" + 1496779987 * this.field_3942;
   }

   public String acm() {
      return "" + 1496779987 * this.field_3942;
   }

   // $FF: renamed from: p (int, byte[], int) boolean
   public boolean method_6205(int var1, byte[] var2, int var3) {
      class_376 var4 = this.field_3940;
      synchronized(this.field_3940) {
         if(var3 >= 0 && var3 <= this.field_3939 * 322921177) {
            boolean var5 = this.method_6201(var1, var2, var3, true, 1123524941);
            if(!var5) {
               var5 = this.method_6201(var1, var2, var3, false, -949505162);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.field_3942 * 1496779987 + ',' + var1 + ',' + var3);
         }
      }
   }

   // $FF: renamed from: y (int, byte[], int) boolean
   public boolean method_6206(int var1, byte[] var2, int var3) {
      class_376 var4 = this.field_3940;
      synchronized(this.field_3940) {
         if(var3 >= 0 && var3 <= this.field_3939 * 322921177) {
            boolean var5 = this.method_6201(var1, var2, var3, true, -69591027);
            if(!var5) {
               var5 = this.method_6201(var1, var2, var3, false, -1357286132);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.field_3942 * 1496779987 + ',' + var1 + ',' + var3);
         }
      }
   }
}
