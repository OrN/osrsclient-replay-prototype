import java.util.Calendar;
import java.util.TimeZone;

// $FF: renamed from: ip
public class class_284 {

   // $FF: renamed from: c int
   public static final int field_3256 = 44;
   // $FF: renamed from: n java.lang.String[]
   public static final String[] field_3257;
   // $FF: renamed from: f java.util.Calendar
   public static Calendar field_3258;
   // $FF: renamed from: v java.lang.String[][]
   public static final String[][] field_3259;
   // $FF: renamed from: p int[]
   public static int[] field_3260;


   // $FF: renamed from: <init> () void
   class_284() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ip.<init>(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3259 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
      field_3257 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
      Calendar.getInstance();
      field_3258 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   // $FF: renamed from: v (java.lang.CharSequence, java.lang.CharSequence, kk, int) int
   public static int method_5189(CharSequence var0, CharSequence var1, class_324 var2, int var3) {
      try {
         int var4 = var0.length();
         int var5 = var1.length();
         int var6 = 0;
         int var7 = 0;
         char var8 = 0;
         char var9 = 0;

         while(true) {
            if(var6 - var8 >= var4) {
               if(var3 != 61619413) {
                  throw new IllegalStateException();
               }

               if(var7 - var9 >= var5) {
                  if(var3 != 61619413) {
                     throw new IllegalStateException();
                  }

                  int var18 = Math.min(var4, var5);

                  char var13;
                  int var19;
                  for(var19 = 0; var19 < var18; ++var19) {
                     if(var3 != 61619413) {
                        throw new IllegalStateException();
                     }

                     if(var2 == class_324.field_3814) {
                        if(var3 != 61619413) {
                           throw new IllegalStateException();
                        }

                        var6 = var4 - 1 - var19;
                        var7 = var5 - 1 - var19;
                     } else {
                        var7 = var19;
                        var6 = var19;
                     }

                     char var12 = var0.charAt(var6);
                     var13 = var1.charAt(var7);
                     if(var12 != var13) {
                        if(var3 != 61619413) {
                           throw new IllegalStateException();
                        }

                        if(Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
                           if(var3 != 61619413) {
                              throw new IllegalStateException();
                           }

                           var12 = Character.toLowerCase(var12);
                           var13 = Character.toLowerCase(var13);
                           if(var13 != var12) {
                              if(var3 != 61619413) {
                                 throw new IllegalStateException();
                              }

                              return class_232.method_4456(var12, var2, (byte)4) - class_232.method_4456(var13, var2, (byte)4);
                           }
                        }
                     }
                  }

                  var19 = var4 - var5;
                  if(0 != var19) {
                     if(var3 != 61619413) {
                        throw new IllegalStateException();
                     }

                     return var19;
                  }

                  for(int var20 = 0; var20 < var18; ++var20) {
                     if(var3 != 61619413) {
                        throw new IllegalStateException();
                     }

                     var13 = var0.charAt(var20);
                     char var14 = var1.charAt(var20);
                     if(var14 != var13) {
                        if(var3 != 61619413) {
                           throw new IllegalStateException();
                        }

                        return class_232.method_4456(var13, var2, (byte)4) - class_232.method_4456(var14, var2, (byte)4);
                     }
                  }

                  return 0;
               }
            }

            if(var6 - var8 >= var4) {
               if(var3 != 61619413) {
                  throw new IllegalStateException();
               }

               return -1;
            }

            if(var7 - var9 >= var5) {
               return 1;
            }

            char var10;
            if(0 != var8) {
               if(var3 != 61619413) {
                  throw new IllegalStateException();
               }

               var10 = var8;
               boolean var16 = false;
            } else {
               var10 = var0.charAt(var6++);
            }

            char var11;
            if(var9 != 0) {
               if(var3 != 61619413) {
                  throw new IllegalStateException();
               }

               var11 = var9;
               boolean var17 = false;
            } else {
               var11 = var1.charAt(var7++);
            }

            var8 = class_105.method_1960(var10, (byte)-53);
            var9 = class_105.method_1960(var11, (byte)-34);
            var10 = method_5190(var10, var2, -1670785567);
            var11 = method_5190(var11, var2, -1308413978);
            if(var10 != var11) {
               if(var3 != 61619413) {
                  throw new IllegalStateException();
               }

               if(Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
                  if(var3 != 61619413) {
                     throw new IllegalStateException();
                  }

                  var10 = Character.toLowerCase(var10);
                  var11 = Character.toLowerCase(var11);
                  if(var10 != var11) {
                     if(var3 != 61619413) {
                        throw new IllegalStateException();
                     }

                     return class_232.method_4456(var10, var2, (byte)4) - class_232.method_4456(var11, var2, (byte)4);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "ip.v(" + ')');
      }
   }

   // $FF: renamed from: n (char, kk, int) char
   static char method_5190(char var0, class_324 var1, int var2) {
      try {
         if(var0 >= 192) {
            if(var2 >= 574186088) {
               throw new IllegalStateException();
            }

            if(var0 <= 255) {
               label263: {
                  if(var2 >= 574186088) {
                     throw new IllegalStateException();
                  }

                  if(var0 >= 192) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var0 <= 198) {
                        if(var2 >= 574186088) {
                           throw new IllegalStateException();
                        }

                        return 'A';
                     }
                  }

                  if(199 == var0) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     return 'C';
                  }

                  if(var0 >= 200 && var0 <= 203) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     return 'E';
                  }

                  if(var0 >= 204) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var0 <= 207) {
                        if(var2 >= 574186088) {
                           throw new IllegalStateException();
                        }

                        return 'I';
                     }
                  }

                  if(var0 == 209) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var1 != class_324.field_3817) {
                        if(var2 >= 574186088) {
                           throw new IllegalStateException();
                        }

                        return 'N';
                     }
                  }

                  if(var0 >= 210 && var0 <= 214) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     return 'O';
                  }

                  if(var0 >= 217) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var0 <= 220) {
                        return 'U';
                     }
                  }

                  if(221 == var0) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     return 'Y';
                  }

                  if(var0 == 223) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     return 's';
                  }

                  if(var0 >= 224) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var0 <= 230) {
                        return 'a';
                     }
                  }

                  if(231 == var0) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     return 'c';
                  }

                  if(var0 >= 232 && var0 <= 235) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     return 'e';
                  }

                  if(var0 >= 236) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var0 <= 239) {
                        if(var2 >= 574186088) {
                           throw new IllegalStateException();
                        }

                        return 'i';
                     }
                  }

                  if(var0 == 241) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(class_324.field_3817 != var1) {
                        if(var2 >= 574186088) {
                           throw new IllegalStateException();
                        }

                        return 'n';
                     }
                  }

                  if(var0 >= 242) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var0 <= 246) {
                        if(var2 >= 574186088) {
                           throw new IllegalStateException();
                        }

                        return 'o';
                     }
                  }

                  if(var0 >= 249) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(var0 <= 252) {
                        if(var2 >= 574186088) {
                           throw new IllegalStateException();
                        }

                        return 'u';
                     }
                  }

                  if(var0 != 253) {
                     if(var2 >= 574186088) {
                        throw new IllegalStateException();
                     }

                     if(255 != var0) {
                        break label263;
                     }
                  }

                  return 'y';
               }
            }
         }

         if(var0 == 338) {
            if(var2 >= 574186088) {
               throw new IllegalStateException();
            } else {
               return 'O';
            }
         } else if(339 == var0) {
            return 'o';
         } else if(376 == var0) {
            if(var2 >= 574186088) {
               throw new IllegalStateException();
            } else {
               return 'Y';
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ip.n(" + ')');
      }
   }
}
