import 'package:flutter/material.dart';

class AppTheme {
  static ThemeData darkTheme = ThemeData.dark().copyWith(
    scaffoldBackgroundColor: const Color(0xFF1C1C1E),
    colorScheme: const ColorScheme.dark(
      primary: Color(0xFF0A84FF),
      secondary: Color(0xFF5E5CE6),
      surface: Color(0xFF2C2C2E),
      background: Color(0xFF1C1C1E),
    ),
    textTheme: const TextTheme(
      displayLarge: TextStyle(
        color: Colors.white,
        fontSize: 48,
        fontWeight: FontWeight.w300,
      ),
      displayMedium: TextStyle(
        color: Colors.white70,
        fontSize: 24,
        fontWeight: FontWeight.w300,
      ),
    ),
  );
} 