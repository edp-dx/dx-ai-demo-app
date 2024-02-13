import React from 'react';
import { render, screen } from '@testing-library/react';
import BadgesDashboard from '../components/BadgesDashboard/BadgesDashboard';

describe('BadgesDashboard', () => {
  it('renders without crashing', () => {
    render(<BadgesDashboard />);
    expect(screen.getByText('Loading...')).toBeInTheDocument();
  });

  // Add more tests as required
});